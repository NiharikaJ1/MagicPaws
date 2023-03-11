<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<h1>Here are your appointment details</h1>

<table border=1>

			<thead>
				<tr>
					<td>name</td>
					<td>mobileNo</td>
					<td>address</td>
					<td>patientName</td>
					<td>service</td>
					<td>id</td>
					<td>options </td>
				</tr>
			</thead>
<c:forEach var="details" items="${details}">
			<tr>
			
				<td>${details.name }</td>
				<td>${details.mobileNo }</td>
				<td>${details.address }</td>
				<td>${details.patientName }</td>
				<td>${details.service }</td>
				<td>${details.id }</td>
				
				
				<td>
				<a href = "getDetails?id=${details.id}" >Get App details</a>
				<a href = "deleteDetails?id=${details.id}" >Cancel app</a>
				
				</td>
				
			</tr>
		</c:forEach>
			
		
		</table>

</body>
</html>