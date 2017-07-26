<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="bookview.title"/></title>
</head>
<body>

<form:form method="POST" action="createBook" commandName="createBookFormBean">

	<table>
	
		<tr>
			<td>
				<form:label path="book.title"><spring:message code="bookview.form.title"/></form:label>
			</td>
			<td>
				<form:input path="book.title"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="book.edition"><spring:message code="bookview.form.edition"/></form:label>
			</td>
			<td>
				<form:input path="book.edition"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="book.year"><spring:message code="bookview.form.year"/></form:label>
			</td>
			<td>
				<form:input path="book.year"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="book.digital"><spring:message code="bookview.form.digital"/></form:label>
			</td>
			<td>
				<form:checkbox path="book.digital"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="coverType"><spring:message code="bookview.form.cover"/></form:label>
			</td>
			<td>
				<form:radiobuttons path="coverType" items="${coverTypes}"/>
			</td>
		</tr>
		<tr>
			<td>
				<form:label path="book.author"><spring:message code="bookview.form.author"/></form:label>
			</td>
			<td>
				<form:select path="book.author">
					<form:options items="${authorNames}"/>
					<form:option value="" label="-----------------"/>
				</form:select>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<spring:message code="bookview.form.button" var="submitLabel"/>
				<input type="submit" value="${submitLabel}"/>
			</td>
		</tr>
	
	</table>

</form:form>


</body>
</html>