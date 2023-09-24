package com.CustomerApplication.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.CustomerApplication.customerdto.CustomerDTO;
import com.CustomerApplication.dao.LoginDao;
import com.CustomerApplication.dao.LoginRepo;
import com.CustomerApplication.entity.CustomerLogin;
import com.CustomerApplication.response.LoginMessage;

@Service
public class LoginService implements LoginInterface {
	@Autowired
	LoginRepo loginrepo;
	
	
	@Autowired 
	PasswordEncoder passwordencoder;

	
	
  @Override
  public LoginMessage logincustomer(CustomerDTO customerDTO) {
	  String msg = "";
	  CustomerLogin customer1 = loginrepo.findByOtp( customerDTO.getOtp());
	  if(customer1 != null) {
		  int otp = customerDTO.getOtp();
		  
		  int encodedOtp = customer1.getOtp();
		  boolean b=true;
//		  Boolean isPwdRight = passwordencoder.matches(String.valueOf(otp), String.valueOf(encodedOtp));
		  if(otp == encodedOtp) {
			  Optional<CustomerLogin> customer = loginrepo.findOneByOtpAndId(customerDTO.getOtp(),customerDTO.getId());
			  if(customer.isPresent()) {
				  return new LoginMessage("Login success",b);
				  
			  }else {
				  return new LoginMessage("Login failure",false);
				  
			  }
			 
		  }else {
			  return new LoginMessage("otp does not match",false);
		  }
		  
	  
	  
	  }else {
		  return new LoginMessage("Id not exisists",false);
	  }
	  
	  
	  
	   
  }

}
