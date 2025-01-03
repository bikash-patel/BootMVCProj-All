package com.bikash.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bikash.model.Farmer;
import com.bikash.service.IFarmerMgmtService;

@Controller
public class MyController {
	
	@Autowired
	private IFarmerMgmtService service;
	
	@GetMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@GetMapping("/farmerdetails")
	public String formPage()
	{
		return "farmer_details";
	}
	
	@PostMapping("/result")
	//Below model attribute is used to read the data from form data and bind the value to 
	//Model class object , if we wont provide name for ModelAttribute it will take 
	//Farmer object reference name as default name
	public String resultPage(Map<String,Object> map,@ModelAttribute("farmer")Farmer farmwer)
	{
		String result=service.checkEligibility(farmwer);
		map.put("result", result);
		return "result";
	}
	
}
