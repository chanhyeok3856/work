<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 다운로드</title>
</head>
<body>
파일이 업로드 되었습니다. 다운로드 페이지입니다.
이름 : ${name}
제목 : ${subject}
파일 다운로드 : <a href ='./down?fileName=${fileName}'>${realFileName}</a><br> <br>
<form action="./down" method="get">
<input type="hidden" name="fileName" value="${fileName}">
<input type="submit" value="다운로드">

</form>
</body>
</html>