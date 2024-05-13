<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" id="signupForm">
<fieldset>
<label for="name">이름</label>
<input type="text" name="name" id="name">
<label for="subject">제목</label>
<input type="text" name="subject" id="subject">
<input type="file" name="file" id="file">
<button type="submit"> 전송 </button>
<button type="reset"> 취소 </button>
</fieldset>
</form>
</body>
</html>