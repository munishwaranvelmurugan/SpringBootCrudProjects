package com.example.Resume.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Resume.Model.RegisterDetailsDB;

public interface DetailsRepo extends JpaRepository<RegisterDetailsDB, Integer>{
	public List<RegisterDetailsDB> findAll();
}
