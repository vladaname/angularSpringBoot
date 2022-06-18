package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.model.Angularuser;

public interface UserService {

	Angularuser registration(Angularuser userReg);

	List<Angularuser> findAllUser();

	boolean deleteUserById(int idAngularUser);

	List<Angularuser> getByEmail(String email);





}
