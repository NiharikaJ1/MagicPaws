package com.springcore.MagicPaws.ResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springcore.MagicPaws.entity.Customer;

	public class CustomerResultSetExtractor implements ResultSetExtractor<List<Customer>> {

		@Override
		public List<Customer> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			

			List<Customer> cusList = new ArrayList<Customer>();
			while (rs.next()) {
				Customer Customer = new Customer();
				Customer.setId(rs.getInt("id"));
				Customer.setName(rs.getString("name"));
				Customer.setPatientName(rs.getString("patientname"));
				Customer.setAddress(rs.getString("address"));
				Customer.setService(rs.getString("service"));
				Customer.setUsername(rs.getString("username"));
				Customer.setMobileNo(rs.getInt("mobileNo"));
				/* System.out.println(customer); */
				cusList.add(Customer);
			}
			return cusList;
		}

	}
	
