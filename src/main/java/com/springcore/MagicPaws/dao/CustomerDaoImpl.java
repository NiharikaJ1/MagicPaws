package com.springcore.MagicPaws.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springcore.MagicPaws.ResultSet.CustomerResultSetExtractor;
import com.springcore.MagicPaws.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public void createRecord(Customer cus) {
	String query=" insert into customer values(?,?,?,?,?,?,?)";
	int r =	this.jdbcTemplate.update(query,cus.getName(),cus.getMobileNo(),cus.getAddress(),cus.getPatientName(),cus.getService(),cus.getId(), cus.getUsername());
	
	}

	@Override
	public List<Customer> fetchAllRecords() {
		String query ="select * from customer";
		ResultSetExtractor<List<Customer>> rst = new CustomerResultSetExtractor();
		
		
		List<Customer> cus = jdbcTemplate.query(query,rst);
		return cus;
		
	}

	@Override
	public void updateRecordById(Customer cus, int id) {
		String query = "update customer set name= ? , mobileNo= ? , patientName=? ,service=? , address=?,  where id= ?";
		int r =	this.jdbcTemplate.update(query,cus.getName(),cus.getMobileNo(),cus.getAddress(),cus.getPatientName(),cus.getService(),cus.getId());
	
				System.out.println("Records updated successfully! "+ cus);
					}

	@Override
	public int deleteRecordById(int id) {
		String query ="delete from customer where id= ?";
		int r =this.jdbcTemplate.update(query,id);
		return r;
	}

	@Override
	public List<Customer> showByUname(String username) {
		String query ="select * from customer where username = ?";
		ResultSetExtractor<List<Customer>> rst = new CustomerResultSetExtractor();
		
		
		List<Customer> cus = jdbcTemplate.query(query,rst, username);
		return cus;
	}

	@Override
	public Customer showById(int id) {
		String query ="select * from customer where id = ?";
		ResultSetExtractor<List<Customer>> rst = new CustomerResultSetExtractor();
		
		
		List<Customer> cus = jdbcTemplate.query(query,rst, id);
		return cus.get(0);
	}

	


   

}