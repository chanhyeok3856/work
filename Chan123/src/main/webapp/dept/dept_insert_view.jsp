<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%
int deptno = Integer.parseInt(request.getParameter("deptno"));
out.println("<script type='text/javascript'>");
out.println("alert('입력하신 "+deptno+"번 부서 번호를 데이터베이스에서 확인하세요.')");
out.println("history.back()");
out.println("</script>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 입력</title>
</head>
<body>

</body>
</html>