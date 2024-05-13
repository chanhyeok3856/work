<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이미지 업로드</title>
<script type="text/javascript">
$(function(){
	$("input[name='file']").change(function(){
		var str = $(this).val();
		var fileName = str.split('\\').pop().toLowerCase();
		checkFileName(fileName);
	});
})
fucntion checkFileName(str){
	var extension =str.split('.').pop().toLowerCase();
	if ($.inArray(extension), ['jpg','png','jpeg','gif']) == -1) {
		alert(extension+'파일은 업로드 하실 수 없습니다.');
		$("#file").val("");
		return;
	}
	var pattern = /[\s\{\}\/?,;:|*~`!^\+<>@\#$%&\\\=\'\"]/;
	if (pattern.test(str)) {
		alert('파일명에 공백문자와 특수문자를 제거해주세요.');
		$("#file").val("");
		return;
	}
}
</script>
</head>
<body>
<form method="post" enctype="multipart/form-data" id="signupForm">
<input type="file" name="file" id="file">
<button type="submit" onchange="return fileValidation();">
전송
</button>
<button type="reset">취소</button>
</form>
</body>
</html>