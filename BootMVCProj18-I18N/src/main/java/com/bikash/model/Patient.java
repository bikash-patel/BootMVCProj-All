package com.bikash.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Patient {
	private String pName;
	private String pAddress;
	private String pGender;
	private String pSickType;
	private Long pMobile;
}
