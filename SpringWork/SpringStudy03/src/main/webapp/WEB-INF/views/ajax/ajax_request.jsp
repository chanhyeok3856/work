<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비동기 Ajax 요청</title>
<link rel="stylesheet" type="text/css" href="./css/bootstrap.min_4.5.0.css">
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="./js/jquery.validate.min.js" type="text/javascript"></script>
<script src="./js/validity.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	$('#register').click(function(){
		var id = $("input[name='id']").val();
		var password = $("input[name='password']").val();
		$.ajax({
			url :"./ajaxData",
			type :"GET",
			data :"id="+id+"&password="+password,
			success : function(result){
				$('#message').html(result);
			}
		});
		return false;
	});
});
</script>
</head>
<body>
<form>
<label for ="id">아이디
</label>
<input type="text" name="id" id="id">
<label for ="password">비밀번호
</label>
<input type="password" name="password" id="password">
<button type="submit" id="register">전송</button>
<button type="reset" id="cancel">취소</button>
</form>
<div id="message"></div>
</body>
</html>