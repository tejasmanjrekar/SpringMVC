<%@page import="management.Course"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h1>Found course =</h1>
	<%	Course course = (Course)session.getAttribute("foundCourse"); 
	out.println(course);%>
</body>
</html>