<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 확인</title>
</head>
<body>
기존 정보 변경 : ID는 ${sessionDTO.id}이다.
세션 수정 정보 : ID는 ${sessionScope.sessionDTO.id}이다.
</body>
</html>