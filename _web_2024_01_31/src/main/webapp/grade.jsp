<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
국어 : <%=request.getParameter("kor") %>
수학 : <%=request.getParameter("math") %>
영어 : <%=request.getParameter("eng") %>
</body>
</html>