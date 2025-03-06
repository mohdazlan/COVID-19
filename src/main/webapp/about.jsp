<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    // Check if session exists and get user attribute
    String user = (String) session.getAttribute("user");

    // If user is not logged in, redirect to login page
    if (user == null) {
        response.sendRedirect("login.jsp");
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
    <h2>About Page</h2>
    <p>Hello, <%= user %>! This is the about page.</p>
    
    <h3>Session Details:</h3>
    <p>Session ID: <%= session.getId() %></p>
    <p>Session Creation Time: <%= new java.util.Date(session.getCreationTime()) %></p>
    <p>Last Accessed Time: <%= new java.util.Date(session.getLastAccessedTime()) %></p>

    <a href="index.jsp">Back to Welcome Page</a> |
    <a href="logout.jsp">Logout</a>
</body>
</html>