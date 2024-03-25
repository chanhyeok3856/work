<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%

request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 파라미터 출력 </title>
</head>
<body>
<div class="1">

이름 : <%=request.getParameter("name")%>
</div>
<div class="1">

나이 : <%=request.getParameter("age")%>
</div>
<div class="1">

이름 : <%=request.getAttribute("name")%>
</div>
<div class="1">

나이 : <%=request.getAttribute("age")%>
</div>
</body>
</html>