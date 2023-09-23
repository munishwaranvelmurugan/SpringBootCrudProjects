package com.example.Resume.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.example.Resume.Model.RegisterDetailsDB;
import com.example.Resume.Repository.DetailsRepo;

@Service
public class SqlService {

	@Autowired
	private DetailsRepo dr;
	
	
	public boolean ValidateUser(String email,String password,RegisterDetailsDB[] rs) {
		if(rs==null)rs=new RegisterDetailsDB[1];
		List<RegisterDetailsDB> select = dr.findAll();
		if(select==null)return false;
		for(int i=0;i<select.size();i++) {
			if(select.get(i).getEmail().equals(email))
			{
				if(select.get(i).getPassword1().equals(password)) {
					rs[0]=select.get(i);
					return true;
				}
				return false;
			}
		}
		return false;
	}
	
	
	public void SaveTheUser(RegisterDetailsDB rs) {
		dr.save(rs);
	}
}
