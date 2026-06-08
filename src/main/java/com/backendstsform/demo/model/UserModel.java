package com.backendstsform.demo.model;

import com.backendstsform.demo.userdto.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_REG_DETAILS")
public class UserModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private String emailId;
	private String qualification;
	private String address;
	private String state;
	private String nationality;
	
	public UserModel(UserDto userdto) {
		this.firstName=userdto.getFirstName();
		this.lastName=userdto.getLastName();
		this.dateOfBirth=userdto.getDob();
		this.gender=userdto.getGender();
		this.emailId=userdto.getEmailId();
		this.qualification=userdto.getQualification();
		this.address=userdto.getAddress();
		this.state=userdto.getState();
		this.nationality=userdto.getNationality();
	}
	
	public UserModel() {
		
	}
}
