package com.backendstsform.demo.service;

import java.util.List;

import com.backendstsform.demo.model.UserModel;
import com.backendstsform.demo.userdto.UserDto;

public interface ServiceInterface{
   UserModel addData(UserDto userdto);
   UserModel deleteUserDataByid(long id);
   List<UserModel> getAllData();
   UserModel getDataByID(long id);
}
