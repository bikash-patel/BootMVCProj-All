package com.bikash.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bikash.model.Student;

@Controller
public class MyDRController {
	
	@GetMapping("/")
	public String showData(Map<String,Object> map)
	{
		
		//Simple Value
		
		/*map.put("name","Bikash");
		map.put("age",23);
		map.put("mblno",9668453230L);*/
		
		//String Value
		/*map.put("names",new String[]{"Bikash","Sasmita","Thabira"});*/
		
		
		//Collections
		/*List<String> color=new ArrayList<String>();
		color.add("Yellow"); color.add("Red"); color.add("Orange");
		
		Set<Integer> age=new HashSet<Integer>();
		age.add(23); age.add(27); age.add(10);
		
		Map<String,Object> phoneDetails=new HashMap<>();
		phoneDetails.put("Bikash",9668453230L); phoneDetails.put("Saroj",9777374038L); phoneDetails.put("Suraj",9178138454L);
		
		//Keep the data in in memory (scope)
		map.put("colors",color);
		map.put("age",age);
		map.put("phoneDetails",phoneDetails);*/
		
		
		
		//Model Object
		Student s1=new Student(101,"Bikash","Khairpali","Job holder");
		Student s2=new Student(102,"Suraj","Bhukta","BCA");
		Student s3=new Student(103,"Saroj","Khaprapali","Job holder");
		Student s4=new Student(104,"Rohit","Kapasira","Batsman");
		Student s5=new Student(105,"Ajay","Khairpali","All Rounder");
		List<Student> students=List.of(s1,s2,s3, s4,s5);
		map.put("students", students);
		
		return "show_report";
	}
}
