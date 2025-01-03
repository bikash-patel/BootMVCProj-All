package com.bikash.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Farmer {
	private Integer fId;
	private String fName;
	private String fAddress="Bargarh";
	private Integer fProperty;
	private Long fNumber;
}
