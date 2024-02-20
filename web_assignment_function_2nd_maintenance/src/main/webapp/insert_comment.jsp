<%@ page import="dao.CommenDao"%>
<%@ page import="dto.Commen"%>
<%@ page import="dao.MemberDao"%>
<%@ page import="dto.Member"%>
<%@ page import="dao.BoardDao"%>
<%@ page import="dto.Board"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.time.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
Member member = (Member) session.getAttribute("member");
if (member == null) {
	response.sendRedirect("index.html");
	return;
}

request.setCharacterEncoding("utf-8");

int num = Integer.parseInt(request.getParameter("num"));
String writer = request.getParameter("commentwriter");
String content = request.getParameter("commentcontent");

if (writer == null || writer.length() == 0 || content == null || content.length() == 0) {
%>

<script>
	alert('내용을 입력하시오 입력하라고 입력해.');
	history.back();
</script>

<%
return;
}
CommenDao dao = CommenDao.getInstance();
Commen commen = new Commen(num, writer, content);
dao.insert(commen);
/* response.sendRedirect("list.jsp"); */
%>

<script>
	alert('댓글 등록 완료');
	location.href = 'view.jsp?num=' + <%=num%>;
</script>