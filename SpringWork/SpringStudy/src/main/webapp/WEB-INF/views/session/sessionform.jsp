<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 수정</title>
</head>
<body>
기존 정보 : ID는 ${sessionDTO.id }이고 PW는 ${sessionDTO.password }이다.<br>
세션 정보 : ID는 ${sessionScope.sessionDTO.id }이다.
<form action="./session" method="post">
<fieldset>
<label for="id">아이디:</label>
<input type="text" name="id" id="id" required><br><br>
<input type="submit" value="저장">
<input type="reset" value="취소">
</fieldset>
</form>
</body>
</html>