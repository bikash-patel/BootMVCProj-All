package com.bikash.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.bikash.entity.Employee;
import com.bikash.repository.MyEmployeeRepo;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private MyEmployeeRepo employeeRepo;
	
	@Override
	public Page<Employee> getAllEmployeeWithPagination(Pageable pageable) {
		Page<Employee> page=employeeRepo.findAll(pageable);
		return page;
	}
	
	@Override
	public String registerEmployee(Employee emp) {
		int id=employeeRepo.save(emp).getEmpid();
		return "New Employee registered with Employee ID : "+id;
	}
	
	@Override
	public Employee fetchEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid ID"));
	}

	@Override
	public String editEmployee(Employee emp) {
		Optional<Employee> opt=employeeRepo.findById(emp.getEmpid());
		if(opt.isPresent())
		{
			employeeRepo.save(emp);
			return "Employee having id "+emp.getEmpid()+" updated!!";
		}
		return "Employee having id "+emp.getEmpid()+" not found!!";
	}
	
	@Override
	public String deleteEmployee(int id) {
		Optional<Employee> opt=employeeRepo.findById(id);
		if(opt.isPresent())
		{
			employeeRepo.deleteById(id);
			return "Employee having id "+id+" removed!!";
		}
		return "Employee having id "+id+" not found!!";
	}
	
	
	@Override
	public Page<Employee> searchEmployeeWithDynamicSearch(Employee employee,Pageable pageable) {
		if(employee.getEmpname().equalsIgnoreCase(null) || employee.getEmpname().length()==0)
			employee.setEmpname(null);
		if(employee.getEmpdeg().equalsIgnoreCase(null) || employee.getEmpdeg().length()==0)
			employee.setEmpdeg(null);
		
		Page<Employee> list=employeeRepo.getEmployeeByAdvSearch(employee.getEmpname(),
											employee.getEmpdeg(),
											employee.getEmpsalary(),
											employee.getDeptno(),pageable);
		list.forEach(System.out::println);
		return list;
	}
}
