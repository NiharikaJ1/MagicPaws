package com.springcore.MagicPaws.ResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springcore.MagicPaws.entity.appointmentDetails;

public class ServiceResultSetExtractor implements ResultSetExtractor<List<appointmentDetails>>{

	@Override
	public List<appointmentDetails> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
	List<appointmentDetails> app = new ArrayList <appointmentDetails>();
	while(rs.next()) {
		appointmentDetails ad= new appointmentDetails();
		ad.setAppointmentNo(rs.getString("appointmentNo"));
		ad.setAdate(rs.getString("adate"));
		ad.setAtime(rs.getString("atime"));
	    ad.setCost(rs.getString("cost"));
	    ad.setId(rs.getLong("id"));
		ad.setService(rs.getString("service"));
		app.add(ad);
			
		
		
	}
		return app;
	
	}
}
