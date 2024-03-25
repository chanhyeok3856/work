<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 부서 정보</title>
</head>
<body>
<section id = "department">
<%=request.getParameter("deptno")%>
<%=request.getAttribute("dname")%>
<%=request.getAttribute("loc")%>
<a href = "./DeptSelect">부서 목록</a>
<a href = "./DeptUpdate?deptno=<%=request.getParameter("deptno")%>">부서 수정</a>
<a href = "./DeptDelete?deptno=<%=request.getParameter("deptno")%>">부서 삭제</a>
</section>
</body>
</html>