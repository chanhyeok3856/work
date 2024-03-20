<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String season = request.getParameter("season");
String id = (String)session.getAttribute("id");
String sessionid = session.getId();
int intervalTime = session.getMaxInactiveInterval();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=id %>님이 가장 좋아하는 계절은 <%= season %>입니다.
세션 ID : <%=sessionid %><br>
세션 유지 시간 : <%=intervalTime %>초
<input type = "button" value="로그아웃" onclick="location.href = './logout.jsp'">
</body>
</html>