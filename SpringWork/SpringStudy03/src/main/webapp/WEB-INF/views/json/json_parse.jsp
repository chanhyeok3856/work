<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSON데이터	</title>

<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>

</head>
<body>
<script type="text/javascript">
var str = '{"usr_id" : "min", "usr_pw" : "1234", "usr_name" : "홍길동"}';
var data = JSON.parse(str);
$.ajax({
	url : "./jsonpost",
	type : "POST",
	dataType : "json",
	contentType : "application/json",
	data : JSON.stringify(data)
});
</script>
</body>
</html>