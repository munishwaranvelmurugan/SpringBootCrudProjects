package com.example.Resume.Model;

import org.springframework.stereotype.Service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "RegisterDetails")
public class RegisterDetailsDB {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String email;
	private String gender;
	private String department;
	private long phoneNo;
	private String doorNo;
	private String country;
	private String state;
	private String distric;
	private int pinCode;
	private String date;
	private String Password1;
	private String Password2;
	
	
	
	

	public RegisterDetailsDB() {
		super();
		
	}
	public RegisterDetailsDB(int id, String name, String email, String gender, String department, long phoneNo,
			String doorNo, String country, String state, String distric, int pinCode, String date, String password1,
			String password2) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.department = department;
		this.phoneNo = phoneNo;
		this.doorNo = doorNo;
		this.country = country;
		this.state = state;
		this.distric = distric;
		this.pinCode = pinCode;
		this.date = date;
		Password1 = password1;
		Password2 = password2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistric() {
		return distric;
	}
	public void setDistric(String distric) {
		this.distric = distric;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPassword1() {
		return Password1;
	}
	public void setPassword1(String password1) {
		Password1 = password1;
	}
	public String getPassword2() {
		return Password2;
	}
	public void setPassword2(String password2) {
		Password2 = password2;
	}
	@Override
	public String toString() {
		return "RegisterDetailsDB [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ ", department=" + department + ", phoneNo=" + phoneNo + ", doorNo=" + doorNo + ", country=" + country
				+ ", state=" + state + ", distric=" + distric + ", pinCode=" + pinCode + ", date=" + date
				+ ", Password1=" + Password1 + ", Password2=" + Password2 + "]";
	}
	

	
}