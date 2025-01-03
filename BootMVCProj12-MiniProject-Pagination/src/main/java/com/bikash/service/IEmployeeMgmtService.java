package com.bikash.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bikash.entity.Employee;

public interface IEmployeeMgmtService {
	public Page<Employee> getAllEmployeeWithPagination(Pageable pageable);
	public String registerEmployee(Employee emp);
	public Employee fetchEmployee(int id);
	public String editEmployee(Employee emp);
	public String deleteEmployee(int id);
	public Page<Employee> searchEmployeeWithDynamicSearch(Employee employee,Pageable pageable);
}
