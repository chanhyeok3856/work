<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="../get"  method="post">
<input type="text" name="name" >
<input type="text" name="id">
<input type="text" name="password">
<input type ="radio" name="gender" value="m">남자
<input type="radio" name ="gender" value="f">여자
<input type="checkbox" value="축구" name="hobby">축구
<input type="checkbox" value="농구" name="hobby">농구
<input type="submit">
</form>
</body>
</html>