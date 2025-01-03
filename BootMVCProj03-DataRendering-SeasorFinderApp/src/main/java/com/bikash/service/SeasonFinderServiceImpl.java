package com.bikash.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderServiceImpl implements IMySeasonFinderService {
	
	@Override
	public String getSeason()
	{
		LocalDateTime ldt=LocalDateTime.now();
		int month=ldt.getMonthValue();
		if(month>=3 && month<=6)
			return "Summer Season";
		else if(month>=7 && month<=10)
			return "Rainy Season";
		else
			return "Winter Season";
	}
}
