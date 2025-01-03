package com.bikash.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private Integer sid;
	private String sname;
	private String adds;
	private String std;
}
