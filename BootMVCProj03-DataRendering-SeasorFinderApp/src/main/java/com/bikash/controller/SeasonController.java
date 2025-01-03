package com.bikash.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bikash.service.IMySeasonFinderService;

@Controller
public class SeasonController {
	
	@Autowired
	private IMySeasonFinderService service;
	
	@RequestMapping("/")
	public String getHome()
	{
		return "welcome";
	}
	
	@RequestMapping("/season")
	public String getSeason(Map<String,Object> map)
	{
		String msg=service.getSeason();
		map.put("season",msg);
		return "season_finder";
	}
}
