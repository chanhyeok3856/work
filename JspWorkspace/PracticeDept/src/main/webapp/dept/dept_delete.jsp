<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 삭제</title>
<section id = "department">
<form action="./DeptDelete" method = "post" id ="sign_dept">
<input type ="text" name ="deptno" id = "deptno" value="<%=request.getParameter("deptno")%>" readonly>
<button type="submit">삭제</button>
<button type="reset">취소</button>
</form>
<a href = "./DeptSelect">부서 목록</a>
<a href = "./DeptInsert">부서 입력</a>
<a href = "./DeptUpdate?deptno=<%=request.getParameter("deptno")%>">부서 수정</a>
</section>
</head>
<body>

</body>
</html>