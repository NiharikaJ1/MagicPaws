package com.springcore.MagicPaws.dao;

import java.util.List;


import com.springcore.MagicPaws.entity.appointmentDetails;

public interface appointmentDetailsDao {
	
	
	public void insert(appointmentDetails app);
	
	public List<appointmentDetails> fetchAllRecords();
	
	public appointmentDetails getRecordsById( int id);
	
    public int deleteRecordById(int id);

	void updateRecordById(appointmentDetails app, int id);
	
    public List<appointmentDetails> join();
}
