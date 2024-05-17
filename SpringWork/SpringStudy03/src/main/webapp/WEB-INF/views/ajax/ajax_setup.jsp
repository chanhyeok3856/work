<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax 요청 기본값</title>
<script src="./js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script type="text/javascript">
$(function(){
	$('#register').click(function(){
		var id = $("input[name='id']").val();
		var password = $("input[name='password']").val();
		$.ajaxSetup({
			url : "./ajaxData",
			type : "POST",
			success : function(result){
				$('#message').html(result);
			}
		});
		$.ajax({
			data : {
				"id" : id,
				"password" : password
			}
		});
		return false;
	});
	
});
</script>
</head>
<body>
<div class="container p-3 my-3 border">
<form>
<fieldset>
<div class="form-group row">
<label for="id" class="ml-sm-4 col-form-label"> 아이디 </label>
<div class="ml-sm-4">
<input type="text" name="id" id="id" class="form-control form-control-sm">
</div>
</div>
<div class="form-group row">
<label for="password" class="ml-sm-3 col-form-label"> 비밀번호 </label>
<div class="ml-sm-3">
<input type="password" name="password" id="password" class="form-control form-control-sm">
</div>
</div>
<div class="form-group">
<button type="submit" id="register" class="btn btn-primary btn-sm"> 전송 </button>
<button type="reset" id="cancel" class="btn btn-primary btn-sm"> 취소 </button>
</div>
</fieldset>
</form>
</div>
<div class="container p-3 my-3 border">
<div id="message"></div>
</div>
</body>
</html>