<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="name" class="min.ser.test.NameDTO"></jsp:useBean>
    
    <% 
    //NameDTO name = new NameDTO();
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= name.getName() %>
</body>
</html>