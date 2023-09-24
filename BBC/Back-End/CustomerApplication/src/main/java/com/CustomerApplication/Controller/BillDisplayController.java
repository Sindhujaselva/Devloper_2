package com.CustomerApplication.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.CustomerApplication.Service.BillDisplayService;
import com.CustomerApplication.entity.Bill;
import com.CustomerApplication.entity.Customer;

@CrossOrigin("*")
@RestController

public class BillDisplayController {
	
	@Autowired
	BillDisplayService billdisservice;
	
 
	


	

	
	@GetMapping("bill/{customerid}")
	public List<Bill> getBillByCustomerId(@PathVariable int customerid) {
		return billdisservice.getBillByCustomerId(customerid);
	}
	
	
   
	 @GetMapping("/billid")
	    public List<Bill> getBillsByBillNumber(
	            @RequestParam("billid") int billid) {
	        return billdisservice.getBillsByNumber(billid);
	    }
		
		
		@PutMapping("/updateBillStatus")
	    public String updateBillStatus(@RequestParam("billid")int billid) {
			return billdisservice.updateBillStatus(billid);
	    }
		
		
		@GetMapping("transactiondetail/{billid}")
		public List<Bill> getbill(@PathVariable int billid){
			return billdisservice.getbill(billid);
		}
}

