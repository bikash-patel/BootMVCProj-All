<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<h1 style="color: green; text-align: center;">Farmer details</h1>
<form action="./result" method="post">
<table style="color: gray;">
<tr>
 	<td>
 		Id : <input type="text" name="fId" required="required">
 	</td>
</tr>
<tr>
 	<td>
 		Name : <input type="text" name="fName" required="required">
 	</td>
</tr>
<tr>
 	<td>
 		Address : <input type="text" name="fAddress" required="required">
 	</td>
</tr>
<tr>
 	<td>
 		Property(Acres) : <input type="number" name="fProperty" required="required">
 	</td>
</tr>
<tr>
 	<td>
 		Phone : <input type="number" name="fNumber" required="required">
 	</td>
</tr>
<tr>
 	<td>
 		<input type="submit" value="Submit">
 	</td>
 	<td>
 		<input type="reset" value="Reset">
 	</td>
</tr>
</table>
</form>