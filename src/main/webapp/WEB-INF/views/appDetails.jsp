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
					<td>patientName</td>
					<td>service</td>
					<td>appointmentNo</td>
					<td>cost</td>
					<td>time</td>
				    <td>date</td>
				
				</tr>
			</thead>

			<tr>
			
				<td>${custDetails.patientName }</td>
				<td>${custDetails.service }</td>
				<td>${appDetails.appointmentNo }</td>
				<td>${appDetails.cost }</td>
				<td>${appDetails.atime }</td>
				<td>${appDetails.adate }</td>
						
				
				
				
			</tr>
		
			
		
		</table>
</body>
</html>