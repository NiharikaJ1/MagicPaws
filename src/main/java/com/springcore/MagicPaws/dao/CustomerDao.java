package com.springcore.MagicPaws.dao;
import java.util.List;

import com.springcore.MagicPaws.entity.Customer;


public interface CustomerDao {
	


		
		// method for adding a record into the database
		public void createRecord(Customer cus);
		
		// method for reading a record from the database
		public List<Customer> fetchAllRecords();
		public List<Customer> showByUname(String username );
		public Customer showById(int id );
	
		
	    // method for deleting a record from the database
		public int deleteRecordById(int id);

		void updateRecordById(Customer cus, int id);
		
		
	}

