<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List of Unity Tag Items</title>

<style>
tr:first-child {
	font-weight: bold;
	background-color: #C6C9C4;
}
</style>
</head>

<body>
	<h2>List of Scan Tags Submitted:</h2>
	<table>
		<tr>
			<td>Check</td>
			<td>Id</td>
			<td>Tag Id</td>
			<td>Tag Description</td>

		</tr>
		<c:forEach items="${unityscantags}" var="unityscantag">
			<tr>
				<td><input type="checkbox" name="${unityscantag.id}"></td>
				<td>${unityscantag.id}</td>
				<td>${unityscantag.tag_id}</td>
				<td>${unityscantag.tag_details}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="<c:url value='/unityScan/unityAdd' />">Add New Scan Tag</a>
</body>
</html>