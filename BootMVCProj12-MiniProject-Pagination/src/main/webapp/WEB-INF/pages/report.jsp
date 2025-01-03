<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">

<div class="container"></div>
<center>
<h1>Search here</h1>
	<frm:form action="search" modelAttribute="emp">  <!-- By default its post and same path from where it called -->
		<table border="1px" style="background-color: cyan">
			<tr>
				<td>Name</td>
				<td>
					<frm:input path="empname"/>
				</td>
			</tr>
			<tr>
				<td>Designation</td>
				<td>
					<frm:input path="empdeg"/>
				</td>
			</tr>
			<tr>
				<td>Salary</td>
				<td>
					<frm:input path="empsalary"/>
				</td>
			</tr>
			<tr>
				<td>Department No</td>
				<td>
					<frm:select path="deptno">
						<frm:option value="">--Select below--</frm:option>
						<frm:option value="10">10</frm:option>
						<frm:option value="20">20</frm:option>
						<frm:option value="30">30</frm:option>
						<frm:option value="40">40</frm:option>
					</frm:select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Search"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</frm:form>
	
	<hr><hr>
	<br><br>
	
<h1>Employee Details</h1>
<b style="color: red">${result}</b> <br>
	<table border="1px" style="background-color: cyan" class="table table-hover">
	<thead>
		<tr style="background-color: yellow;">
			<th>EMP ID</th>
			<th>EMP NAME</th>
			<th>EMP DEG</th>
			<th>EMP SALARY</th>
			<th>DEPT NO</th>
			<th>Operation</th>
		</tr>
	</thead>
	<c:choose>
		<c:when test="${!empty employee}">
			<c:forEach var="emp" items="${employee}">
				<tr>
					<td>${emp.empid}</td>
					<td>${emp.empname}</td>
					<td>${emp.empdeg}</td>
					<td>${emp.empsalary}</td>
					<td>${emp.deptno}</td>
					<td><a href="edit?id=${emp.empid}"><img src="images/edit.png" height="40px" width="30px"></a>
						&nbsp;&nbsp;
						<a onclick="return confirm('Are you sure want to delete ?')" href="delete?id=${emp.empid}"><img src="images/delete.png" height="40px" width="30px"></a>
					</td>
				</tr>
			</c:forEach>
		</c:when>
		<c:otherwise>
			<b>No result found .....</b>
		</c:otherwise>
	</c:choose>
	</table>
	<br><br>
	
		<c:if test="${!page.isFirst()}">
		<a href="report?page=0">First</a> &nbsp;&nbsp;
		</c:if>
		
		<c:if test="${!page.isLast()}">
		<a href="report?page=${page.getNumber()+1}">Next</a> &nbsp;&nbsp;
		</c:if>
		[
		<c:forEach var="i" begin="0"  step="1" end="${page.getTotalPages()-1}">
			<a href="report?page=${i}">Page ${i+1}</a>&nbsp;&nbsp;
		</c:forEach>
		]
		<c:if test="${!page.isFirst()}">
		<a href="report?page=${page.getNumber()-1}">Previous</a> &nbsp;&nbsp;
		</c:if>
		
		<c:if test="${!page.isLast()}">
		<a href="report?page=${page.getTotalPages()-1}">Last</a> &nbsp;&nbsp;
		</c:if>
	
	<br><br>
	<a href="./"><img src="images/home.png" height="40px" width="30px"><br>Home</a> <br>
	<a href="./register"><img src="images/add.png" height="40px" width="30px"><br>Register</a>
</center>
