package com.springcore.MagicPaws.ResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.springcore.MagicPaws.entity.login;
import com.springcore.MagicPaws.entity.login;

public class loginResultSetExtractor implements ResultSetExtractor<List<login>> {

	@Override
	public List<login> extractData(ResultSet rs) throws SQLException, DataAccessException {
List<login> log = new ArrayList<login>();
		
		while(rs.next())
		{

			login l= new login();
		l.setPass(rs.getString("pass"));
		l.setUserName(rs.getString("userName"));
		l.setUtype(rs.getString("utype"));
			
			log.add(l);
				
		}
		
		
		
		return log;
	
	}

}
