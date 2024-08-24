<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
</body>
</html>

  <jsp:useBean id="emp" class="beans.Employee" scope="session"></jsp:useBean>
  <jsp:setProperty name="emp" param="eid" property="eid"></jsp:setProperty>
  <jsp:setProperty name="emp" param="ename" property="ename"></jsp:setProperty>
  <jsp:setProperty name="emp" param="salary" property="salary"></jsp:setProperty>
 
  <jsp:include page="/views/success.jsp"></jsp:include>