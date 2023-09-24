package com.CustomerApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.CustomerApplication.entity.Payment;

@EnableJpaRepositories
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

	
}