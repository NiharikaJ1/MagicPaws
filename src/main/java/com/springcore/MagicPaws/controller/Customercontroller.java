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
import com.springcore.MagicPaws.entity.Customer;
import com.springcore.MagicPaws.entity.appointmentDetails;

@Controller
public class Customercontroller {
	@Autowired
	private CustomerDao cdao;
	
	@Autowired
	appointmentDetailsDao adao;
	
	@RequestMapping("/customer")
	public String showForm() {
		return "customer";
	}
	@ModelAttribute("Customer")
	public Customer getCustomer()
	{
		return new Customer();
	}


	@RequestMapping("/createRecord")
	public String create(@ModelAttribute Customer cust, Model model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		cust.setUsername(username);
		
		System.out.println(cust);
		cdao.createRecord(cust);
	
		System.out.println(cust);
		
		appointmentDetails app= new appointmentDetails();
		
		app.setAdate("!assigned");
		app.setAppointmentNo(null);
		app.setAtime("!assigned");
		app.setCost(null);
		app.setId(cust.getId());
		adao.insert(app);
		
		return "confirm";
	}
	
	
	
	@RequestMapping("/fetchAllRecords")
	public void fetch(@ModelAttribute Customer cust, Model model) {
		cdao.fetchAllRecords();
		System.out.println(cust);
	}
	
	@RequestMapping("/deleteRecordById")
	public void delete(@ModelAttribute Customer cust, Model model) {
		cdao.deleteRecordById(0);
		System.out.println(cust);
	}
	
	
	@RequestMapping("/updateRecordById")
	public void update(@ModelAttribute Customer cust, Model model) {
		cdao.updateRecordById(cust, 0);
		System.out.println(cust);
	}
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model)
	{   List<Customer> cust = new ArrayList<Customer>();
	HttpSession session = request.getSession();
	String username = (String) session.getAttribute("username");
	cust= cdao.showByUname(username);
	model.addAttribute("details",cust);

		return "view";
	}
	@RequestMapping("/getDetails")
	public String getDetails( @RequestParam("id") int id, Model model )
	{ 
		Customer cust = cdao.showById(id);
		model.addAttribute("custDetails",cust);
		
		appointmentDetails app = adao.getRecordsById(id);
	model.addAttribute("appDetails", app);
		return "appDetails";
	}
	
	@RequestMapping("/deleteDetails")
	public String delete( @RequestParam("id") int id,Model model)
	{ cdao.deleteRecordById(id);
	 
	Customer cust = cdao.showById(id);
	model.addAttribute("custDetails",cust);
	
	appointmentDetails app = adao.getRecordsById(id);
model.addAttribute("appDetails", app);
	return "appDetails";
				}
	
	
	
	
}

