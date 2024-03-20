<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
세션 유지 여부 : <%=session.isNew( )%>
<br>
쿠키 값 : <%=request.getAttribute("value") %>
</body>
</html>