<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 정보 입력</title>
</head>
<body>
<section id = "department">
<form action="./DeptInsert" method="post" id = "sign_dept">
<input type="text" name ="deptno" id = "deptno">
<input type="text" name ="dname" id = "dname">
<input type="text" name ="loc" id = "loc">
<button type="submit">등록</button>
<button type="reset">취소</button>
</form>
<a href="./DeptSelect">부서 목록</a>


</section>
</body>
</html>