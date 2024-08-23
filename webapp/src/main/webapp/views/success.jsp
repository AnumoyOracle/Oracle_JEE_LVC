<%@ page import="beans.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

 <%-- <%
 
    Employee emp = (Employee)session.getAttribute("emp");
    out.println(emp.getEid() + " " + emp.getEname() + " " + emp.getSalary());
 
 %> --%>

 <jsp:useBean id="emp" class="beans.Employee" scope="session"></jsp:useBean>
 <jsp:getProperty name="emp" property="eid"></jsp:getProperty>
 <jsp:getProperty name="emp" property="ename"></jsp:getProperty>
 <jsp:getProperty name="emp" property="salary"></jsp:getProperty> 

</body>
</html>