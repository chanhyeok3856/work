<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List 인터페이스의 값</title>
</head>
<body>
전체 내용 : ${list}
개별 내용 : ${list[1]}
<%
@SuppressWarnings("rawtypes")
List list = (List) request.getAttribute("list");
for(Object menu : list){
	pageContext.setAttribute("menu", menu);

%>
${menu}
<%} %>
</body>
</html>