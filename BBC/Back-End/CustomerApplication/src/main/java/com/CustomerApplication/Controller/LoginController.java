package com.CustomerApplication.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerApplication.Service.LoginInterface;
import com.CustomerApplication.Service.LoginService;
import com.CustomerApplication.customerdto.CustomerDTO;
import com.CustomerApplication.entity.CustomerLogin;
import com.CustomerApplication.response.LoginMessage;

@RestController
@CrossOrigin("*") 
public class LoginController {
	
	@Autowired
	LoginInterface logininterface;
	
	
	
	
	
	@PostMapping(path = "/login")
	    public ResponseEntity<?>logincustomer(@RequestBody CustomerDTO customerDTO)
	    {
	        LoginMessage loginmessage = logininterface.logincustomer(customerDTO);
	        		return ResponseEntity.ok(loginmessage);
	    }

}
