package com.springcore.MagicPaws.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springcore.MagicPaws.entity.Customer;
import com.springcore.MagicPaws.entity.login;
import com.springcore.MagicPaws.dao.CustomerDao;
import com.springcore.MagicPaws.dao.loginDao;
@Controller
public class LoginController {
	@Autowired
	private loginDao dao;
	
	@Autowired
	CustomerDao cdao;
	@ModelAttribute("login")
	public login getLogin() {

		return new login();
	}
	
	
@RequestMapping("/choice")
	
	public String choice()
	{
		return "choice";
	}
	
	@RequestMapping("/login")
	
	public String login()
	{
		return "login";
	}
	@RequestMapping("/register")
	public String register()
	{
		return "register";
	}

	@RequestMapping("/registerAct")
	public String registrationAct(@ModelAttribute login reg)
	{
		dao.register(reg);
		System.out.println(reg);
		
		return "customer";
		
	}
	@RequestMapping("/loginAct")
	public String loginAct(@ModelAttribute login log, HttpServletRequest request)
	{   String cus="customer";
         String ad="admin";
	if(dao.login(log))
	{
		if(log.getUtype().equals(cus))
		{
			HttpSession session = request.getSession();
			session.setAttribute("username", log.getUserName());
			return "customerLogin";
		}
		if(log.getUtype().equals(ad))
		return "admin";
	}
	

		
	
		
        return "login";		
	} 

}




