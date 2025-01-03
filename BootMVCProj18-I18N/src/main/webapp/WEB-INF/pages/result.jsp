<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="cg"%>

<center>
<h1 style="color: green; text-align: center;"><c:message code="home.title"/></h1>

<br><br>

	<b style="text-align: center;">Current Local : ${pageContext.response.locale}</b>
	<fmt:setLocale value="locale"/>
	<br>
	<fmt:formatDate var="date" value="${sysDate}" type="date" dateStyle="FULL"/>
	<b>Current Date : ${date}</b>
	<br>
	<fmt:formatDate var="time" value="${sysDate}" type="time" dateStyle="FULL"/>
	<b>Current Time : ${time}</b>
	<br>
	<fmt:formatNumber var="fees" value="${bill}"  type="number"/>
	<b>Bill : ${fees}</b>
	<br>
	<fmt:formatNumber var="free" value="${freeTrmt}"  type="percent"/>
	<b>Discount : ${free}</b>
	
	<hr>
	<table style="background-color: cyan" border="1px">
	<tr>
		<td><c:message code="register.name"/></td>
		<td> ${result.getPName()}</td>
	</tr>
	<tr>
		<td><c:message code="register.address"/></td>
		<td> ${result.getPAddress()}</td>
	</tr>
	<tr>
		<td><c:message code="register.gender"/></td>
		<td>${result.getPGender()}</td>
	</tr>
	<tr>
		<td><c:message code="register.sick"/></td>
		<td> ${result.getPSickType()}</td>
	</tr>
	<tr>
		<td><c:message code="register.mobile"/></td>
		<td> ${result.getPMobile()}</td>
	</tr>
	</table>
<br><br>


<a href="?lang=hi_IN">Hindi</a> &nbsp;&nbsp;
<a href="?lang=or_IN">Odia</a> &nbsp;&nbsp;
<a href="?lang=te_IN">Telugu</a> &nbsp;&nbsp;
<a href="?lang=pa_IN">Punjabi</a> &nbsp;&nbsp;
<a href="?lang=eg_UK">English</a> &nbsp;&nbsp;



<h3 style="color: green; text-align: center;"><a href="./">Home</a></h3>
</center>
