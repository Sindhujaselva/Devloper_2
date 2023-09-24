package com.CustomerApplication.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CustomerApplication.entity.Bill;
import com.CustomerApplication.entity.Customer;




@Repository
public class BillDisplayDao {

	@Autowired
	SessionFactory factory;

//	public List<Customer> billdisplay() {
//		Session session  = factory.openSession();
//		Criteria criteria=session.createCriteria(Customer.class);
//		return criteria.list();
//	}

//	public List<Customer> getbilldetail() {
//		Session session  = factory.openSession();
//		Criteria criteria=session.createCriteria(Customer.class);
//		return criteria.list();
//	}

	public List<Bill> getBillByCustomerId(int customerid) {
		Session session  = factory.openSession();
		Criteria criteria = session.createCriteria(Bill.class);
		criteria.add(Restrictions.eq("customerid",customerid));
		return criteria.list();
	}

//	public void updatestatus(Bill bill) {
//		Session session  = factory.openSession();
//		session.update(bill);
//		session.beginTransaction().commit();
//		
//		
//	}
	public List<Bill> getBillsByNumber(int billid) {
		try (Session session = factory.openSession()) {
	        Criteria criteria = session.createCriteria(Bill.class);
	        criteria.add(Restrictions.eq("billid", billid));
	        return criteria.list();
	    }
	}

	public String add(Bill bill) {
		Session session = factory.openSession();
		session.update(bill);
		session.beginTransaction().commit();
		return "successfull";
	}

	public List<Bill> getbill(int billid) {
		Session session  = factory.openSession();
		Criteria criteria = session.createCriteria(Bill.class);
		criteria.add(Restrictions.eq("billid",billid));
		return criteria.list();
	}

	
	





	



	
	

}
