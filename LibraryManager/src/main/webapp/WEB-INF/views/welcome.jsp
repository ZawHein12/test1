<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome from Trustcore Traning center<br>
<h2>${msg}</h2>
<h3>${person}</h3>
<form:form method="post" action="${pageContext.request.contextPath}/postInfo.htm" commandName="person">
First Name: <form:input path="firstName" type="text"/>
Last Name: <form:input path="lastName" type="text" />
Roll NO: <form:input path="rollNo" type="text" />
<br/>
<input type="submit" value="Submit" />
</form:form>
</body>
</html>