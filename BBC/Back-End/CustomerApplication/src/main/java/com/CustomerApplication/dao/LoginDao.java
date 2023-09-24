package com.CustomerApplication.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.CustomerApplication.entity.CustomerLogin;

@EnableJpaRepositories
@Repository
public class LoginDao {
	
	@Autowired
	SessionFactory factory;

	// dTO is replaced instaed of dao

	

}
