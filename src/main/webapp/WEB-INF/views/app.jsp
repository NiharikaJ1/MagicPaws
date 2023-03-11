a<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
App details-

<table border=1>

			<thead>
				<tr>
					<td>id</td>
					<td>service</td>
					<td>appointmentNo</td>
					<td>cost</td>
					<td>time</td>
				    <td>date</td>
				
				</tr>
			</thead>
			
			<c:forEach var="appDetails" items="${appDetails}">
			<tr>
			
				<td>${appDetails.id }</td>
				<td>${appDetails.service }</td>
				<td>${appDetails.appointmentNo }</td>
				<td>${appDetails.cost }</td>
				<td>${appDetails.atime }</td>
				<td>${appDetails.adate }</td>
				
				
				
				
			</tr>
		</c:forEach>
			
		
		</table>
</body>
</html>