<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

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
	<table border="1px" style="background-color: cyan">
		<tr style="background-color: yellow;">
			<th>EMP ID</th>
			<th>EMP NAME</th>
			<th>EMP DEG</th>
			<th>EMP SALARY</th>
			<th>DEPT NO</th>
			<th>Operation</th>
		</tr>
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
	<a href="./"><img src="images/home.png" height="40px" width="30px"><br>Home</a> <br>
	<a href="./register"><img src="images/add.png" height="40px" width="30px"><br>Register</a>
</center>