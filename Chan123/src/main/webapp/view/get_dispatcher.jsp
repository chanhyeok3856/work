<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<section id = "member">
<div class = "1">
<div class= "2">
<div class="3">
<div class="4">
<form action="../GetDispatcher" method="get" id="signupForm">
<fieldset>
<div class="5">
<label for="name" class="6">이름</label>
<div class="7">
<input type ="text" name ="name" id ="name" class="8">
</div>
</div>
<div class="5">
<label for = "age" class="6">나이</label>
<div class="7">
<input type="text" name ="age" id="age" class="8">
</div>
</div>
<div class="9">
<button type="submit" id ="register" class ="10">전송</button>
<button type="reset" id ="cancel" class ="10">취소</button>
</div>
</fieldset>
</form>
</div></div></div>
</div>
</section>
</body>
</html>