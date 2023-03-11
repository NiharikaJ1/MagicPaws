package com.springcore.MagicPaws.dao;

import java.util.List;

import com.springcore.MagicPaws.entity.Customer;
import com.springcore.MagicPaws.entity.login;

public interface loginDao {

	public void register(login log);
	public boolean login(login log);
	public int forget(login log);
	
	
	

}
