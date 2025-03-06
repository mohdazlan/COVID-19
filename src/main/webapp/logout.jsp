<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    // Invalidate the session to log out the user
    if (session != null) {
        session.invalidate(); // Destroys the session
    }

    // Redirect to login page
    response.sendRedirect("login.html");
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>