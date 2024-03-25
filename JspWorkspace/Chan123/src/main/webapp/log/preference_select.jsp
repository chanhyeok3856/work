<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String id = (String)session.getAttribute("id");
Cookie[] cookies = request.getCookies();
if(cookies != null) {
	for(Cookie cookie : cookies){
		if(cookie.getName().equals("id")){
			id=cookie.getValue();
			session.setAttribute("id", id);
		}
	}
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="./preference_check.jsp" method="post">
<%= id %>님 환영합니다.
<label for = "season">가장 좋아하는 계절은?</label>
<input type="radio" name="season"  value="봄"  checked>봄 
<input type="radio" name="season"  value="여름" >여름 
<input type="radio" name="season"  value="가을" >가을 
<input type="radio" name="season"  value="겨울" >겨울
<button type="submit" >전송</button>
</form>
</body>
</html>