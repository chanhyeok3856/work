<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% Boolean bool = (Boolean)request.getSession().getAttribute("bool"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
if(bool == true) {
	%>
	데이터베이스와 연결되었습니다
	<%
}else {
	 %>
	 데이터베이스 연결에 실패하였습니다.
	 <%
}
%>

</body>
</html>