package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Angularuser;

@Transactional
@Repository
public interface UserRepository extends JpaRepository<Angularuser, Integer>{

	List<Angularuser> findByEmail(String email);



}
