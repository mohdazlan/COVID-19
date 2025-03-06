<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
// Get the current session, but do not create a new one
String user = (String) session.getAttribute("user");
// If session is invalid or user is not logged in, redirect to login page
if (user == null) {
	response.sendRedirect("login.html");
	return;
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>
		Welcome,
		<%=user%>!
	</h2>
	<p>You have successfully logged in.</p>
	<a href="logout.jsp">Logout</a>
</body>
</html>