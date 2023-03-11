package com.springcore.MagicPaws.dao;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.springcore.MagicPaws.ResultSet.loginResultSetExtractor;
import com.springcore.MagicPaws.entity.login;

@Repository
public class loginDaoImpl implements loginDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void register(login log) {
		String query="select * from login where userName = ?";
		Object records[]= { log.getUserName()};
		ResultSetExtractor<List<login>> rst = new loginResultSetExtractor();
		
		
		List<login> logi = jdbcTemplate.query(query,rst, records);
		if(logi.isEmpty())
		{

			 query = "insert into login values(?,?,?)";
			Object record[]= { log.getUserName(), log.getPass(), log.getUtype()};
				jdbcTemplate.update(query,record);
				System.out.println("Records added successfully! "+ record);
		}
		System.out.println("username already exist");
		
			
		
	}

	@Override
	public boolean login(login log) {
	String query="select * from login where userName=? and pass =? and utype=?";
	Object records[]= { log.getUserName(), log.getPass(), log.getUtype()};
	ResultSetExtractor<List<login>> rst = new loginResultSetExtractor();
	
	
	List<login> logi = jdbcTemplate.query(query,rst, records);
	if(logi.isEmpty())
	{
		return false;
	}
	
	
		return true;
	
	}
	
	

	@Override
	public int forget(com.springcore.MagicPaws.entity.login log) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
