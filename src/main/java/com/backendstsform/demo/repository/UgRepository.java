package com.backendstsform.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backendstsform.demo.model.UserModel;


@Repository
public interface UgRepository extends JpaRepository<UserModel, Long>{
	


}
