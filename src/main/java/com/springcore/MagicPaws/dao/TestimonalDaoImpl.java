package com.springcore.MagicPaws.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.springcore.MagicPaws.ResultSet.TestimonalResultSetExtractor;
import com.springcore.MagicPaws.entity.Testimonal;
@Repository
public class TestimonalDaoImpl implements TestimonalDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(Testimonal test) {
		String query= "insert into testimonal values(?,?)";
		int r=this.jdbcTemplate.update(query,test.getReview(),test.getT_name());		
	}

	@Override
	public List<Testimonal> show() {
		String query ="select * from testimonal";
		ResultSetExtractor<List<Testimonal>> rst = new TestimonalResultSetExtractor();
		
		
		List<Testimonal> testi = jdbcTemplate.query(query,rst);
		
	
		
		return testi;
	}


	
	
}
