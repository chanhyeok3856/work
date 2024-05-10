<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<link rel="stylesheet" type="text/css" href="./resources/css/bootstrap.min_4.5.0.css">
<script src="./resources/js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./resources/js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="./resources/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="./resources/js/validity.js" type="text/javascript"></script>
</head>
<body>
<section id="login">
<div class="container">
<div class="row">
<div class="col-6 mx-auto">
<div class="card">
<div class="card-header"> <h4> ID 로그인 </h4> </div>
<div class="card-body">
<form action="./login_admin" method="post" id="signupForm">
<fieldset>
<div class="form-group">
<label for="id"> 아이디 </label>
<input type="text" name="id" id="id" class="form-control">
</div>
<div class="form-group">
<label for="password"> 비밀번호 </label>
<input type="password" name="password" id="password" class="form-control">
</div>
<button type="submit" id="register" class="btn btn-primary btn-block"> 로그인 </button>
</fieldset>
</form>
</div>
</div>
</div>
</div>
</div>
</section>
</body>
</html>