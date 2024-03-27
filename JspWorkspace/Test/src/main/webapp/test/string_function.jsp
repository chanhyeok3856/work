<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fn" uri ="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>문자열 함수</title>
</head>
<body>
<c:set var="greeting" value = "How are you? 안녕" />
대문자 변경 : ${fn:toUpperCase(greeting)}
소문자 변경 : ${fn:toLowerCase(greeting)}
Are의 인덱스 : ${fn:indexOf(greeting, "Are")}
Are을 Were로 변경 : ${fn:replace(greeting, "Are", "Were")}
</body>
</html>