package com.CustomerApplication.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.CustomerApplication.Service.TransactionService;
import com.CustomerApplication.entity.Payment;



@CrossOrigin("*")
@RestController
public class TransactionController {
	@Autowired
	TransactionService transactionservice;
	

	 @PostMapping("/save")
	    public ResponseEntity<Payment> savePayment(@RequestBody Payment payment) {
	        Payment savedPayment = transactionservice.savePayment(payment);
	        return new ResponseEntity<>(savedPayment, HttpStatus.CREATED);
	    }

}
