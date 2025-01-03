<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
    

<h1 style="color: green; text-align: center;">Farmer details</h1>
<frm:form modelAttribute="frmr">
<!-- Here in form tag method mode is by default post mode , and if we won't provide the 
action path then from when (path) this form called , it will redirect back to the same path
 this form is called from farmerdetails path so it will redirect again to same path because
 here we have not declared the action attribute,-->
<table style="color: gray;">
<tr>
	<td>
		Id : 
	</td>
 	<td>
 		<frm:input type="text" path="fId" required="required"/>
 	</td>
</tr>
<tr>
	<td>
		Name : 
	</td>
 	<td>
 		<frm:input type="text" path="fName" required="required"/>
 	</td>
</tr>
<tr>
	<td>
		Address :  
	</td>
 	<td>
 		<frm:input type="text" path="fAddress" required="required"/>
 	</td>
</tr>
<tr>
	<td>
		Property(Acres) :  
	</td>
 	<td>
 		<frm:input type="number" path="fProperty" required="required"/>
 	</td>
</tr>
<tr>
	<td>
		Phone :  
	</td>
 	<td>
 		<frm:input type="number" path="fNumber" required="required"/>
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
</frm:form>