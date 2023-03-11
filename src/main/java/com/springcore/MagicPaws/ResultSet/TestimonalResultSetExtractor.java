package com.springcore.MagicPaws.ResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.springcore.MagicPaws.entity.Testimonal;

public class TestimonalResultSetExtractor implements ResultSetExtractor<List<Testimonal>>{

	@Override
	public List<Testimonal> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Testimonal> testi = new ArrayList<Testimonal>();
		
		while(rs.next())
		{

			Testimonal t= new Testimonal();
			t.setReview(rs.getString("review"));
			t.setT_name(rs.getString("t_name"));
			
			
			testi.add(t);
				
		}
		
		
		
		return testi;
	}

}
