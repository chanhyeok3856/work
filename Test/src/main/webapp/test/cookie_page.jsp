<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String view_page1 = "view_page";
//System.out.println(view_page);
String cookie = request.getHeader("Cookie");
System.out.println(cookie);
if(cookie !=null){
	Cookie[] cookies = request.getCookies();
	
	for(int i =0; i < cookies.length; i++){
		String se = cookies[i].getName();
		System.out.println(se);
		if(cookies[i].getName().equals("cookie_page")){
			view_page1 = cookies[i].getValue();
			System.out.println(view_page1);
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
<% if(view_page1.equals("view_page")) {%>
뷰페이지
<% }else{%>
쿠키 페이지
<% }%>
<form action="./cookie_setting.jsp" method="post">
<input type="radio" name="cookie_page" value = "view_page" checked >뷰 페이지 보기
<input type="radio" name="cookie_page" value="cookie_page"<% if(view_page1.equals("cookie_page")){ %>
checked <%} %>> 쿠키 페이지 보기
<input type="submit" value="설정">
</form>
</body>
</html>
