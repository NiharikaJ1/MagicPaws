package com.springcore.MagicPaws.dao;

import java.util.List;

import com.springcore.MagicPaws.entity.Testimonal;

public interface TestimonalDao {

	public void insert(Testimonal test);
	public List<Testimonal> show();
}
