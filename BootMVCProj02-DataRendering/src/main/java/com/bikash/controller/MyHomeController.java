package com.bikash.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyHomeController {
	
	/*@RequestMapping("/")
	public String getHomePage(Map<String,Object> map) //shared Memory is created by 
	 												 //DispatcherServlet based on parameter type
	{
		System.out.println("Shared Memory Name :"+map.getClass());
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(70));
		return "welcome";
	}*/
	//Above shared memory is always good practice to take
	//Above map parameter is not a HashMap its a shared memory
	
	/*@RequestMapping("/")
	public String getHomePage(ModelMap map)
	{
		System.out.println("Shared Memory Name :"+map.getClass());
		map.addAttribute("sysDate",new Date());
		map.addAttribute("age",new Random().nextInt(70));
		return "welcome";
	}*/
	//Above shared memory is not recommended because addAttribute is provided by Spring
	//and it's non-invasive
	
	
	/*@RequestMapping("/welcome")
	public ModelMap getHomePage()  //Here user is responsible to create shared memory
	{
		ModelMap map=new BindingAwareModelMap();
		map.addAttribute("sysDate",new Date());
		map.addAttribute("age",new Random().nextInt(70));
		return map;
	}*/
	//Above shared memory is not recommended because its created by programmer and
	// we don't have control on LVN, here LVN is by default same as request path and
	//we can not set '/' as request path, we must need to give a name here
	
	/*@RequestMapping("/welcome")
	public Map<String,Object> getHomePage()  //Here user is responsible to create shared memory
	{
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("sysDate",new Date());
		map.put("age",new Random().nextInt(70));
		return map;
	}*/
	//Above shared memory is not recommended because its created by programmer and
	// we don't have control on LVN, here LVN is by default same as request path and
	//we can not set '/' as request path, we must need to give a name here
	
	/*@RequestMapping("/")
	public ModelAndView getHomePage()  //Here user is responsible to create shared memory
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("sysDate",new Date());
		mav.addObject("age",new Random().nextInt(70));
		mav.setViewName("welcome");
		return mav;
	}
	*/	//Above shared memory is not recommended because its created by programmer and
	//its very legacy one (Old) but here we have control on LVN
	
	
	/*@RequestMapping("/")
	public String Source(Map<String,Object> map)
	{
		map.put("sysDate",LocalDate.now());
		map.put("number",new Random().nextInt(80));
		return "forward:display";  
		//In forwarding both source and destination use same request and response
		//so we can use model attribute of source into the dest or in jspel
	}*/
	
	/*@RequestMapping("/welcome")
	public void getHome(Map<String,Object> map)
	{
		map.put("sysDate",LocalDate.now());
		map.put("age",new Random().nextInt(100));
		//If return type is void then it use request path name as LVN
		//In this case we can't use / as RequestMapping path 
	}*/
	
	/*@RequestMapping("/welcome")
	public String getHome(Map<String,Object> map)
	{
		map.put("sysDate",LocalDate.now());
		map.put("age",new Random().nextInt(100));
		return null;
		//If return type is String and we return null then it use request path name as LVN
		//In this case we can't use / as RequestMapping path 
	}*/
	
	@RequestMapping("/")
	public String Source(Map<String,Object> map)
	{
		map.put("sysDate",LocalDate.now());
		map.put("number",new Random().nextInt(80));
		return "redirect:display";  
		//In redirecting both source and destination use diff request and response
		//here for both diff request so we can not access source model attribute value
		//in to the destination or in jspel
	}
	
	@RequestMapping("/display")
	public String Dest(Map<String,Object> map)
	{
		map.put("name","Bikash");
		return "display";
	}
}
