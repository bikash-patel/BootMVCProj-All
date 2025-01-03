package com.bikash.service;

import org.springframework.stereotype.Service;

import com.bikash.model.Farmer;

@Service
public class FarmerMgmtImpl implements IFarmerMgmtService {

	@Override
	public String checkEligibility(Farmer farmer) {
		int property=farmer.getFProperty();
		if ((int) property > 10) {
			return "You are not eligible for farmer id";
		}
		return "Congratulation...Will notify shortly for further process ";
	}

}
