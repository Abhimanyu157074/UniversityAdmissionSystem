<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
    background-image: url("pics/bg1.jpg");
}
table {
align="center";
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University Admission System</title>
</head>
<body align="center">
<%-- <jsp:forward page="welcome.obj" /> --%>
	<fieldset>
		<h1>University Admission System</h1>
		<h2>Welcome!</h2>
		<table border="2">
		<tr>
		<td><img src="pics/Applicant-button.jpg" width="256" height="265" alt="Applicant"/>Implement Applicant</td>
		<td><img src="pics/capgemini-university.jpg" width="500" height="333" alt="Home"/></td>
		<td><img src="pics/Staff-button.jpg" width="256" height="256" alt="Admin/Mac"/>Implement Admin/MAC Login</td>
		</tr>
		</table>
		
		<!-- <br> <a href="applicantHome.obj">Applicant</a>
		<br> <a href="xyz.obj">Non-Applicant</a> -->
		
	</fieldset>
	<div id="footer">
	<p>2018. Copyright reserved &copy;. Designed by <a href="https://www.in.capgemini.com/" rel="nofollow">Group 5, JEE PT ATP Batch</a></p>
	</div>
</body>
</html>