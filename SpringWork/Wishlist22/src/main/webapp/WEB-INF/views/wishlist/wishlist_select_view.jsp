<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 상세 조회</title>
</head>
<body>
${wishlistDTO}

    <p>상품 이름: ${productname}</p>
    <p>상품 번호: ${productnum}</p>
    <p>유저 아이디: ${userid}</p>

<button onclick="goToIndexPage()">돌아가기</button>
<script type="text/javascript">
    function goToIndexPage() {
        location.href = "./wishlistindex.jsp";
    }
</script>
</body>
</html>