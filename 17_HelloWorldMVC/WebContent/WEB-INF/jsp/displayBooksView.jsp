<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach items="${books}" var="book">
<tr>
	<td>${book.title}</td>
	<td>${book.year}</td>
	<td>${book.edition}</td>
	<td>${book.author}</td>
	<td>${book.digital}</td>
</tr>
</c:forEach>
</table>
</body>
</html>