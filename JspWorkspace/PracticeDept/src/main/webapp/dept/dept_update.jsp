<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 수정</title>
</head>
<body>
<section id = "department">
<form action="./DeptUpdate" method = "post" id="sign_dept">
<input type="text" name = "deptno" id ="deptno" value = "<%=request.getParameter("deptno")%>" readonly>
<input type="text" name = "dname" id ="dname" value = "<%=request.getAttribute("dname")%>">
<input type="text" name = "loc" id ="loc" value = "<%=request.getAttribute("loc")%>">
<button type="submit">등록</button>
<button type="reset">취소</button>
</form>
<a href=".DeptSelect">부서 목록</a>
<a href=".DeptInsert">부서 입력</a>
<a href=".DeptDelete?dpetno=<%=request.getParameter("deptno")%>">부서 삭제</a>
</section>
</body>
</html>