<%@ taglib uri="http://www.springframework.org/tags" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color: green; text-align: center;"><c:message code="home.link"/></h1>
<center>
<br><br>
<frm:form method="POST" modelAttribute="patient">
 <table border="1px" style="background-color: cyan ; align:center">
 	<tr>
 		<td><c:message code="register.name"/></td>
 		<td><frm:input path="pName"/></td>
 	</tr>
 	<tr>
 		<td><c:message code="register.address"/></td>
 		<td><frm:input path="pAddress"/></td>
 	</tr>
 	<tr>
 		<td><c:message code="register.gender"/></td>
 		<td><frm:input path="pGender"/></td>
 	</tr>
 	<tr>
 		<td><c:message code="register.sick"/></td>
 		<td><frm:input path="pSickType"/></td>
 	</tr>
 	<tr>
 		<td><c:message code="register.mobile"/></td>
 		<td><frm:input path="pMobile"/></td>
 	</tr>
 	<tr>
 		<td><input type="submit" value='<c:message code="register.submit"/>'></td>
 		<td><input type="reset" value='<c:message code="register.reset"/>'></td>
 	</tr>
 </table>
</frm:form>

<br><br>
</center>
<center>
<a href="?lang=hi_IN">Hindi</a> &nbsp;&nbsp;
<a href="?lang=or_IN">Odia</a> &nbsp;&nbsp;
<a href="?lang=te_IN">Telugu</a> &nbsp;&nbsp;
<a href="?lang=pa_IN">Punjabi</a> &nbsp;&nbsp;
<a href="?lang=eg_UK">English</a> &nbsp;&nbsp;
</center>


