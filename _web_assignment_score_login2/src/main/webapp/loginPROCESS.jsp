<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
request.setCharacterEncoding("utf-8");

String id = request.getParameter("id");
String pw = request.getParameter("pw");

boolean login = false;

String sql = "SELECT COUNT(*) FROM SCORE WHERE NUM = ? AND NAME = ?";

Class.forName("oracle.jdbc.driver.OracleDriver");

try (Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
		PreparedStatement pstmt = conn.prepareStatement(sql);) {

	pstmt.setString(1, id);
	pstmt.setString(2, pw);

	ResultSet rs = pstmt.executeQuery();

	rs.next();
	if (rs.getInt(1) == 1) {
		login = true;

	} else {
		System.out.println("로그인 못했다~");
	}
} catch (Exception e) {
	System.out.println("오류지롱");
}
if (login) {
	Cookie cookie = new Cookie("userId", id);
	cookie.setMaxAge(-1); // 웹 브라우저가 닫힐 때 쿠키 만료됨
	response.addCookie(cookie);

	response.sendRedirect("index.jsp"); // 로그인 메인 화면으로 돌아감
	return;

}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>

	<script>
		alert('아이디 또는 비밀번호가 틀립니다!');
		history.back();
	</script>

</body>
</html>