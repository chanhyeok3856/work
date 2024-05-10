<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 부서 관리 </title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" >
<link rel="stylesheet" type="text/css" href="./resources/css/bootstrap.min_4.5.0.css">
<link rel="stylesheet" type="text/css" href="./resources/css/global.css">
<script src="./resources/js/jquery-3.5.1.min.js" type="text/javascript"></script>
<script src="./resources/js/bootstrap.min_4.5.0.js" type="text/javascript"></script>
</head>
<body>
<header id="main-header" class="py-2 btn-dark text-white">
<div class="container">
<div class="row">
<div class="col-md-6">
<h1> 부서 관리 </h1>
</div>
</div>
</div>
</header>
<section id="dept" class="py-4 mb-4 bg-light">
</section>
<section id="details">
<div class="container">
<div class="row">
<div class="col-md-12">
<div class="card">
<div class="card-header">
<h5> 부서 목록 </h5>
</div>
<div class="card-body">
<table class="table table-hover">
<thead class="thead-light">
<tr class="text-center">
<th> 부서 번호 </th> <th> 부서 이름 </th> <th> 부서 지역 </th> <th></th>
</tr>
</thead>
<tbody>
<%--객체를 호출하고 파라미터에 저장하여 반복한다.--%>
<c:forEach var="list" items="${list}">
<tr class="text-center">
<td>${list.deptno}</td>
<td>${list.dname}</td>
<td>${list.loc}</td>
<td>
<a href="./DeptSelectDetail?deptno=${list.deptno}" class="btn btn-outline-info">
부서 상세 보기
</a>
</td>
</tr>
</c:forEach>
<%--객체값이 null일 경우에 반환한다.--%>
<c:if test="${empty list}">
<tr>
<td colspan="4"> 등록된 부서가 없습니다. </td>
</tr>
</c:if>
</tbody>
</table>
<div>
<a href="./DeptInsert" class="btn btn-success btn-block">
부서 입력
</a>
</div>
</div>
</div>
</div>
</div>
</div>
</section>
</body>
</html>