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
import org.springframework.web.bind.annotation.RequestParam;

import com.springcore.MagicPaws.dao.CustomerDao;
import com.springcore.MagicPaws.dao.appointmentDetailsDao;
import com.springcore.MagicPaws.entity.appointmentDetails;
import com.springcore.MagicPaws.entity.Customer;

@Controller
public class AdminController {
	
	@Autowired
	appointmentDetailsDao adao;
	@Autowired
	CustomerDao cdao;
	
@RequestMapping("/admin")
public String admin()
{
	return "admin";
}

@ModelAttribute("appointmentDetails")
public appointmentDetails getAppointmentDetails()
{
	return new appointmentDetails();
}

@RequestMapping("/viewApp")
public String viewApp(Model model)
{  List<Customer> cust = new ArrayList<Customer>();
   cust= cdao.fetchAllRecords();
  model.addAttribute("details",cust);
  
	
	return "viewApp";
}

@RequestMapping("/allocate")
public String allocate(@RequestParam("id") int id, HttpServletRequest request ) {
	
	HttpSession session = request.getSession();
	session.setAttribute("id",id);
	
	return "fillDetails";
}

@RequestMapping("/fillDetails")
public String fillDetails(@ModelAttribute appointmentDetails app, HttpServletRequest request)
{
	HttpSession session = request.getSession();
	int id = (Integer) session.getAttribute("id");
	app.setId(id);
	adao.updateRecordById(app, id);
	session.removeAttribute("id");
	
	return "admin";
}
@RequestMapping("/vapp")
public String vapp(Model model)
{
	List<appointmentDetails> app = adao.join();
	model.addAttribute("appDetails", app);
	System.out.println(app.get(0));
	
	return "app";
	
}
}
