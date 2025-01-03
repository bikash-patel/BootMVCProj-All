package com.bikash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHomeController {

	/*	@RequestMapping("/home")
		public String homeVisit()
		{
			return "welcome";
		}*/

	@RequestMapping("/")
	public String homeVisit()
	{
		return "welcome";
	}
}
