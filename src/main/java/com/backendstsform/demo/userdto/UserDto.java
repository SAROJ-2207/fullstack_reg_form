package com.backendstsform.demo.userdto;

import lombok.Data;

@Data
public class UserDto {
	private String firstName;      // Changed from FirstName
    private String lastName;       // Changed from LastName
    private String dob;            // Changed from Dob
    private String gender;         // Changed from Gender
    private String emailId;        // Changed from EmailId
    private String qualification;  // Changed from Qualification
    private String address;        // Changed from Address
    private String state;          // Changed from State
    private String nationality;
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Override
	public String toString() {
		return "UserDto [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender
				+ ", emailId=" + emailId + ", qualification=" + qualification + ", address=" + address + ", state="
				+ state + ", nationality=" + nationality + "]";
	}
}
