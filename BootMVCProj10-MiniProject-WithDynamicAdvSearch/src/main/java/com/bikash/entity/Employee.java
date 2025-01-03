package com.bikash.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Employee")
@Data
public class Employee {
	
	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "emp_seq1",initialValue = 10000,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	private Integer empid;
	
	@Column(length = 30)
	private String empname;
	
	@Column(length = 30)
	private String empdeg;
	
	private Double empsalary;
	
	private Integer deptno=10;
}
