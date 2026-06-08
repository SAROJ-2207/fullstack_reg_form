package com.backendstsform.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backendstsform.demo.model.UserModel;
import com.backendstsform.demo.repository.UgRepository;
import com.backendstsform.demo.userdto.UserDto;

@Service
public class ServiceClass implements ServiceInterface {
	
	@Autowired
	public UgRepository ugrepo;

	@Override
	public UserModel addData(UserDto userdto) {
		UserModel adduser = new UserModel(userdto);
		return ugrepo.save(adduser);
	}

	@Override
	public UserModel deleteUserDataByid(long id) {
		Optional<UserModel> userid = ugrepo.findById(id);
		if(userid.isPresent()) {
			ugrepo.delete(userid.get());
		}else {
			System.out.println("Unable to find goiven id: "+id);
		}
		return null;
	}
	
	@Override
	public List<UserModel> getAllData() {
		List<UserModel> getdata = ugrepo.findAll();
		return getdata;
	}

	@Override
	public UserModel getDataByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
