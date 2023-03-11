package com.springcore.MagicPaws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springcore.MagicPaws.dao.TestimonalDao;
import com.springcore.MagicPaws.entity.Testimonal;
@Controller
public class Testimonalcontroller {

	@Autowired
	private TestimonalDao tdao;
	
	@ModelAttribute("Testimonal")
	public Testimonal getTestimonal()
	{
		return new Testimonal();
	}
	@RequestMapping("/testimonal")
	public String showForm(Model model) {
		List<Testimonal> testi = new ArrayList<Testimonal>();
		testi = tdao.show();
		model.addAttribute("Testi",testi);
		return "testimonal";
	}
	

	@RequestMapping("/insert")
	public String create(@ModelAttribute Testimonal test, Model model) {
		System.out.println(test);
		tdao.insert(test);
		
		System.out.println(test);
		List<Testimonal> testi = new ArrayList<Testimonal>();
		testi = tdao.show();
		model.addAttribute("Testi",testi);
		return "testimonal";
	}
}
