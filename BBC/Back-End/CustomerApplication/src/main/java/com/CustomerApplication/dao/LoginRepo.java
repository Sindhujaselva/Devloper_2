package com.CustomerApplication.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.CustomerApplication.entity.CustomerLogin;

@EnableJpaRepositories
@Repository
public interface LoginRepo extends JpaRepository<CustomerLogin,Integer> {

	CustomerLogin findByOtp(int otp);

	

	Optional<CustomerLogin> findOneByOtpAndId(int otp, int id);
	


}

