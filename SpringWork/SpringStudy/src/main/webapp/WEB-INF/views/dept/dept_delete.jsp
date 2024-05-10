<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title> 부서 정보 삭제 </title>
<link rel="stylesheet" type="text/css" href="./resources/css/bootstrap.min_4.5.0.css">
<link rel="stylesheet" type="text/css" href="./resources/css/global.css">
<script src="./resources/js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./resources/js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
<script src="./resources/js/jquery.validate.min.js" type="text/javascript"></script>
<script src="./resources/js/dept_validity.js" type="text/javascript"></script>
</head>
<body>
<header id="main-header" class="py-2 btn-dark text-white">
<div class="container">
<div class="row">
<div class="col-md-6"> <h1> 부서 정보 삭제 </h1> </div>
</div>
</div>
</header>
<section id="actions" class="py-4 mb-4 bg-light">
</section>
<section id="details">
<div class="container">
<div class="row">
<div class="col-md-12">
<div class="card">
<div class="card-header">
<h5> 부서 삭제 </h5>
</div>
<div class="card-body">
<form method="post" id="sign_dept">
<fieldset>
<div class="form-group row">
<label for="name" class="ml-sm-3 col-form-label"> 부서 번호 </label>
<div class="ml-sm-3">
<input type="text" name="deptno" id="deptno" class="form-control form-control-sm bg-white"
value="${param.deptno}" readonly>
</div>
</div>
<div class="form-group">
<button type="submit" class="btn btn-secondary"> 삭제 </button>
<button type="reset" class="btn btn-secondary"> 취소 </button>
</div>
</fieldset>
</form>
<div class="row">
<div class="col-md-4">
<a href="./DeptSelect" class="btn btn-primary btn-block">
부서 목록
</a>
</div>
<div class="col-md-4">
<a href="./DeptInsert" class="btn btn-success btn-block">
부서 입력
</a>
</div>
<div class="col-md-4">
<a href="./DeptUpdate?deptno=${param.deptno}" class="btn btn-warning btn-block">
부서 수정
</a>
</div>
</div>
</div>
</div>
</div>
</div>
</div>
</section>
</body>
</html>