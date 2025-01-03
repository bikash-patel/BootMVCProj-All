package com.bikash.controller;

import java.io.PrintWriter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@Controller
public class MyController {
	
	/*@GetMapping("/")
	public String homePage()
	{
		return "home";
	}
	@GetMapping("/result")
	public String resultPage(@RequestParam String name,
			    			 @RequestParam(defaultValue = "Bargarh") String add) 
	//Its mandatory to pass values for all the parameter , if we don't want to pass value for 
	//any parameter then for that we have to pass required=false or need to pass default value
	// using defaultValue in RequestParam annotation
	{
		String uname=name;
		String address=add;
		System.out.println("Name : "+uname+" Address : "+address);
		return "result";
	}*/
	
	@Autowired
	private ServletContext sContext;
	
	@Autowired
	private ServletConfig sConfig;
	
	/*@GetMapping("/")
	public String homePage(Map<String,Object> map,HttpServletRequest req,HttpServletResponse res,HttpSession session) throws Exception
	{
		String appName=sContext.getContextPath();
		String serName=sConfig.getServletName();
		String reqPath=req.getContextPath();
		String id=session.getId();
		
		//Keep all these data in shared memory 
		map.put("appName",appName);
		map.put("serName",serName);
		map.put("reqPath",reqPath);
		map.put("id",id);
		
		return "result_details";
	}*/
	
	
	@GetMapping("/")
	public void homePage(Map<String,Object> map,HttpServletRequest req,HttpServletResponse res,HttpSession session) throws Exception
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		pw.println("request path : "+req.getServletPath());
	}
}
