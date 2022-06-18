package com.example.demo.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserRegistrationDto;
import com.example.demo.model.Angularuser;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;

	@Override
	public Angularuser registration(Angularuser userReg) {
		
			Angularuser a = new Angularuser();
			a.setEmail(userReg.getEmail());
			a.setDomain(userReg.getDomain());
			a.setName(userReg.getName());
			a.setExperiance(userReg.getExperiance());
			userRepository.saveAndFlush(a);
			
			return a;
		
		
	}

	@Override
	public List<Angularuser> getByEmail(String email) {
		List<Angularuser> findUser = userRepository.findByEmail(email);
		return findUser;
	}

	@Override
	public List<Angularuser> findAllUser() {
		List<Angularuser> findAll = userRepository.findAll();
		
		return findAll;
	}

	@Override
	public boolean deleteUserById(int idAngularUser) {
		Optional<Angularuser> findUseerById = userRepository.findById(idAngularUser);
		if(findUseerById.isPresent()) {
			Angularuser userId = findUseerById.get();
			userRepository.delete(userId);
			
			return true;
		}
		return false;
	}

	

}
