<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : <%=request.getAttribute("name")%>
나이 : <%=request.getAttribute("age")%>
아이디 : <%=request.getAttribute("id") %>
비밀번호 : <%=request.getAttribute("password") %>
성별 : <%=request.getAttribute("gender") %>
취미 : <%=request.getAttribute("hobby") %>
</body>
</html>