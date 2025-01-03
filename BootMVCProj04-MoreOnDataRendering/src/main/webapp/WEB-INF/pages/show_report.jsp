<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%-- <h1>Simple Value</h1>

<b style="text-align:center;">${name},${age},${mblno}</b> --%>


<%-- <h1>String Value</h1>

<c:if test="${names ne null}">
<b>User names : </b>
		<c:forEach var="name" items="${names}">
			${name},
		</c:forEach>
</c:if> --%>


<%-- <h1>Colletions</h1>

<b>Colors Details :</b>
<c:if test="${!empty colors}">
	${colors} <br>
	<c:forEach var="col" items="${colors}">
		 ${col},
	</c:forEach>
</c:if>

<br><br>

<b>Age Details :</b>
<c:if test="${!empty age}">
	<c:forEach var="age" items="${age}">
		 ${age}
	</c:forEach>
</c:if>

<br><br>

<b>Number Details :</b>
<c:if test="${!empty phoneDetails}">
	<c:forEach var="pd" items="${phoneDetails}">
		 ${pd.key}=${pd.value}
	</c:forEach>
</c:if> --%>


<h1>Model object </h1>
<c:choose>
	<c:when test="${!empty students}">
	<table border="1" bgcolor="cyan" align="center">
		<tr>
			<th>SID</th>
			<th>SNAME</th>
			<th>SADDRESS</th>
			<th>STD</th>
		</tr>
			<c:forEach var="std" items="${students}">
			  <tr>
			  	<td>${std.sid}</td> 
			  	<td>${std.sname}</td>
			  	<td>${std.adds}</td>
			  	<td>${std.std}</td>
			  </tr>
			</c:forEach>
	</table>
	</c:when>
	<c:otherwise>
	<b>No Details Found</b>
	</c:otherwise>
</c:choose>
