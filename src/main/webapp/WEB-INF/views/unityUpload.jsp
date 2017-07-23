<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unity Scan Upload</title>

<style>
tr:first-child {
	font-weight: bold;
	background-color: #C6C9C4;
}
</style>

</head>


<body>
	<h2>Upload Scan Tag</h2>
	<form:form method="POST" modelAttribute="unityscan">
		<form:input type="hidden" path="id" id="id" />
		<table>
			<tr>
				<td><label for="name">Tag ID: </label></td>
				<td><form:input path="tag_id" id="tag_id" /></td>
				<td><form:errors path="tag_id" cssClass="error" /></td>
			</tr>

			<tr>
				<td><label for="tagscript">Tag Script: </label></td>
				<td><form:input path="tag_details" id="tag_details" /></td>
				<td><form:errors path="tag_details" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3" align="right"><input type="submit"
					value="Scan Now" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<a href="<c:url value='/new' />">See Scan Results</a>
</body>
</html>