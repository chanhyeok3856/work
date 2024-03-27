<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL 결과 출력</title>
</head>
<body>
<sql:setDataSource var = "conn" driver = "oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe"
user="scott" password="tiger"/>
<sql:update dataSource="${conn}"> insert into dept (deptno, dname, loc) values (80, '기획실', '서울') </sql:update>
<sql:query var = "rs" dataSource ="${conn}">
select * from dept where deptno = ?
<sql:param>80</sql:param>
</sql:query>
<c:forEach var="data" items="${rs.rows}">
${data['deptno']}
${data['dname']}
${data['loc']}
</c:forEach>
</body>
</html>