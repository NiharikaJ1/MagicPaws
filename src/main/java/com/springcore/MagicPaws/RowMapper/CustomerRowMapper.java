package com.springcore.MagicPaws.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Customer customer = new Customer();
		customer.setCustomer_id(rs.getInt("customer_id"));
		customer.Customer_name(rs.getString("customer_name"));
		customer.setCustomer_patientname(rs.getInt("customer_patientname"));
		customer.setCustomer_address(rs.getString("customer_address"));
		customer.setCustomer_service(rs.getString("customer_service"));
		return customer;
	}

}