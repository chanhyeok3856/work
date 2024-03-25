<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
String name = "";
String sessionid = "";
if(session.getAttribute("name")!=null){
	name= (String)session.getAttribute("name");
	sessionid = session.getId();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="#" method="get">
<input type = "button" onclick="location.href='./session_save.jsp'" value="세션 저장">
<input type = "button" onclick="location.href='./session_remove.jsp'" value="세션 삭제">
<input type = "button" onclick="location.href='./session_resave.jsp'" value="세션 재 저장">
<p> 세션 값 : <%= name %><p>
<p> 세션 ID : <%= sessionid %><p>

</form>
</body>
</html>