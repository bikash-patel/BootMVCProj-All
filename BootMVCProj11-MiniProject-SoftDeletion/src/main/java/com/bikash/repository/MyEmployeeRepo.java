package com.bikash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bikash.entity.Employee;

public interface MyEmployeeRepo extends JpaRepository<Employee,Integer> {
	
	@Query("SELECT e FROM Employee e WHERE " +
		       "(:ename IS NULL OR e.empname LIKE CONCAT('%', :ename, '%')) AND " +
		       "(:edeg IS NULL OR e.empdeg LIKE CONCAT('%', :edeg, '%')) AND " +
		       "(:esal IS NULL OR e.empsalary = :esal) AND " +
		       "(:deptno IS NULL OR e.deptno = :deptno)")
	public List<Employee> getEmployeeByAdvSearch(@Param("ename") String ename,
												 @Param("edeg") String edeg,
												 @Param("esal") Double esal,
												 @Param("deptno") Integer deptno);

}
