<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "insert into score(num, name, kor, eng, math) values(?,?,?,?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, request.getParameter("num"));
	pstmt.setString(2, request.getParameter("name"));
	pstmt.setString(3, request.getParameter("kor"));
	pstmt.setString(4, request.getParameter("eng"));
	pstmt.setString(5, request.getParameter("math"));
	int result = pstmt.executeUpdate();
	if (result >= 1) {
		out.println("입력 성공");
	} else {
		out.println("입력 실패");
	}
	%>
	
	<%
	response.sendRedirect("index.jsp");
	%>

	<a href="index.jsp">목록</a>
</body>
</html>