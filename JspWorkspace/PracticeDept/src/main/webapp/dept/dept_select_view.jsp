<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "chan.dept.dto.DeptDTO, java.util.ArrayList"%>
    <%
    @SuppressWarnings("unchecked")
    ArrayList<DeptDTO> arrayList = (ArrayList<DeptDTO>) request.getAttribute("arrayList");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 관리</title>
</head>
<body>
<section id = "department">
<%
for(DeptDTO deptDTO : arrayList) {
%>
<%=deptDTO.getDeptno()%>
<%=deptDTO.getDname()%>
<%=deptDTO.getLoc()%>
<a href="./DeptSelectDetail?deptno=<%=deptDTO.getDeptno()%>">부서 상세 보기</a>
<%
}
%>
<a href="./DeptInsert">부서 입력</a>
</section>
</body>
</html>