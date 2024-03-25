<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="chan.dept.dto.DeptDTO, java.util.ArrayList"%>
    <%
    @SuppressWarnings("unchecked")
    ArrayList<DeptDTO> arrayList = (ArrayList<DeptDTO>) request.getSession().getAttribute("arrayList");
    int deptno = Integer.parseInt(request.getParameter("deptno"));
    for (DeptDTO deptDTO : arrayList) {
    	if(deptDTO.getDeptno() == deptno) {
    		out.println("<script type='text/javascript'>");
    		out.println("alert('입력하신 "+deptno+"번의 부서 번호가 존재합니다. 다시 입력하세요.')");
    		out.println("location.href='../DeptInsert'");
    		out.println("</script>");
    	}
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 입력</title>
<script type="text/javascript">
alert("입력하신 <%=deptno%> 번의 부서 번호를 등록하였습니다.");
location.href="../DeptSelect"
</script>
</head>
<body>
</body>
</html>