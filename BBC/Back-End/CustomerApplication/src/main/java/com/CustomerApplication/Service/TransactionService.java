package com.CustomerApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CustomerApplication.dao.PaymentRepository;
import com.CustomerApplication.entity.Payment;


@Service
public class TransactionService {
	@Autowired
	PaymentRepository paymentRepository;

    public Payment savePayment(Payment payment) {
        
        return paymentRepository.save(payment);
    }

}
