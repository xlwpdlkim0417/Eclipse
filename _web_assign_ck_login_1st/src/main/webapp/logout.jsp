<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import = "util.Cookies" %>
<%
	response.addCookie(Cookies.createCookie("userCredentials", "", "/", 0));
%>
<html>
<head><title>로그아웃</title></head>
<body>

로그아웃하였습니다.
<!-- response.sendRedirect("index.jsp"); -->
<a href="index.jsp">index</a>
</body>
</html>
