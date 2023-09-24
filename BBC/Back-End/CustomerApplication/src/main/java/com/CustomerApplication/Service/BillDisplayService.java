package com.CustomerApplication.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.CustomerApplication.dao.BillDisplayDao;
import com.CustomerApplication.dao.BillRepository;
import com.CustomerApplication.entity.Bill;
import com.CustomerApplication.entity.Customer;
import com.CustomerApplication.entity.CustomerLogin;


@Service
public class BillDisplayService {
	@Autowired
	BillDisplayDao billdisdao;
	
	@Autowired
    BillRepository billRepository;

	

	
	

	

	public List<Bill> getBillByCustomerId(int customerid) {
		return billdisdao.getBillByCustomerId(customerid);
	}


	

	
	 public List<Bill> getBillsByNumber(int billid) {
			return billdisdao.getBillsByNumber(billid);
		}


		public String updateBillStatus(int billid) {
			List<Bill> bills = billdisdao.getBillsByNumber(billid);
			Bill bill=new Bill();
			
			for(Bill b:bills) {
				bill.setStatus("paid");
				bill.setBillamount(b.getBillamount());
				bill.setCustomerid(b.getCustomerid());
				bill.setBillid(b.getBillid());
				
				return billdisdao.add(bill);
			}
			return null;
			
		}

		public List<Bill> getbill(int billid) {
			return billdisdao.getbill(billid);
		}

	




	
	}
