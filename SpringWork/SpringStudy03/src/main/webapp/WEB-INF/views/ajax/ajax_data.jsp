<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 접근 권한 체크 </title>

</head>
<body>
<div class="container p-3 my-3 border">
입력한 아이디는 ${param.id}이며
<c:choose>
<%--jstl은 & 연산자가 지원되지 않으므로 & 연산자를 선언하면 오류가 발생한다.--%>
<c:when test="${param.id=='admin' && param.password=='1234'}">
접근 권한이 있습니다.
</c:when>
<c:otherwise>
접근 권한이 없습니다.
</c:otherwise>
</c:choose>
</div>
</body>
</html>