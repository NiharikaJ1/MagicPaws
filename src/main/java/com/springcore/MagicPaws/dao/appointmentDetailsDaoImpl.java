package com.springcore.MagicPaws.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.springcore.MagicPaws.ResultSet.ServiceResultSetExtractor;
import com.springcore.MagicPaws.ResultSet.appointmentDetailsResultSetExtractor;
import com.springcore.MagicPaws.entity.appointmentDetails;
@Repository
public class appointmentDetailsDaoImpl implements appointmentDetailsDao {
     @Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void insert(appointmentDetails app) {
	String query= "insert into appointmentDetails values(?,?,?,?,?)";
	int r= this.jdbcTemplate.update(query,app.getAppointmentNo(),app.getCost(),app.getId(),app.getAdate(),app.getAtime());
		
	}

	@Override
	public List<appointmentDetails> fetchAllRecords() {
		
			String query ="select * from appointmentDetails";
			ResultSetExtractor<List<appointmentDetails>> rst = new appointmentDetailsResultSetExtractor();
			
			
			List<appointmentDetails> app = jdbcTemplate.query(query,rst);
			return app;
	}
		
	
	@Override
	public int deleteRecordById(int id) {
		String query ="delete from customer where id= ?";
		int r =this.jdbcTemplate.update(query,id);
		return r;
	}
		
		
	@Override
	public void updateRecordById(appointmentDetails app, int id) {
	    String query = "update appointmentDetails set appointmentNo= ? , cost= ? , atime=? ,adate=?  where id= ?";
	    int r =	this.jdbcTemplate.update(query,app.getAppointmentNo(),app.getCost(),app.getAtime(),app.getAdate(),app.getId());
	    System.out.println("Records updated successfully! "+ app);
	}

	@Override
	public appointmentDetails getRecordsById(int id) {
		String query ="select * from appointmentDetails where id =?";
		ResultSetExtractor<List<appointmentDetails>> rst = new appointmentDetailsResultSetExtractor();
		
		
		List<appointmentDetails> app = jdbcTemplate.query(query,rst, id);
		return app.get(0);
	}

	@Override
	public List<appointmentDetails> join() {
		String query ="SELECT appointmentDetails.appointmentNo, appointmentDetails.cost, appointmentDetails.id, appointmentDetails.adate, appointmentDetails.atime, customer.service FROM appointmentDetails INNER JOIN customer ON  appointmentDetails.id=customer.id where appointmentDetails.adate != '!assigned '" ;
		ResultSetExtractor<List<appointmentDetails>> rst = new ServiceResultSetExtractor();
		
		
		List<appointmentDetails> app = jdbcTemplate.query(query,rst);
		System.out.println(app.get(0));
		return app;
	}
	

}
