<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 등록</title>
</head>
<body>
<form method = "post" enctype="application/x-www-form-urlencoded">
<fieldset>
<input type="hidden" name="number" value="1">
<label for="title">제목</label><input type="text" name="title" id="title" required><br>
<label for ="content">내용</label><input type="text" name="content" id="content" required><br><br>
<input type="submit" value="전송">
<input type="reset" value="취소">
</fieldset>
</form>
</body>
</html>