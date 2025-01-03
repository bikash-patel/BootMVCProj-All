package com.bikash.controller;

import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bikash.model.Patient;

import jakarta.servlet.http.HttpSession;

@Controller
public class MyHospitalController {
	
	@GetMapping("/")
	public String homePage()
	{
		return "home";
	}
	
	@GetMapping("/register")
	public String registerPage(@ModelAttribute Patient patient)
	{
		return "register_form";
	}
	
	@PostMapping("/register")
	public String resultPage(@ModelAttribute Patient patient,HttpSession red)
	{
		//red.addFlashAttribute("result",patient);
		red.setAttribute("result",patient);
		return "redirect:result";
	}
	@GetMapping("/result")
	public String resultPage(@ModelAttribute Patient patient,Map<String,Object> map)
	{
		map.put("sysDate",new Date());
		map.put("bill",10000);
		map.put("freeTrmt",(30/100));
		return "result";
	}
	
	
}
