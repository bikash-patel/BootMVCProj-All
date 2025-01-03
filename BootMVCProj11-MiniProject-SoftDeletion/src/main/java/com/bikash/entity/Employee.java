package com.bikash.entity;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "WIPROEMPLOYEE")
@Data
@SQLDelete(sql = "update wiproemployee set status='INACTIVE' where empid=?") 
//Above query is for soft delete , whenever delete request come this above SQLDelete will be 
//executed and inside that deletion we have written update operation
@SQLRestriction(value = "status <> 'INACTIVE'")
//Above line is like where caluse , it will display all the records whose status not in Inactive 
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
	
	@Column(length = 30)
	private String status="ACTIVE";
}
