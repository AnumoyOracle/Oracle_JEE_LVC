<%@ page   isELIgnored="false"  import="entity.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>EMPLOYEE DETAILS ADDED TO EMP_DB TABLE</h1>

<% 
	    Employee emp1  = (Employee) session.getAttribute("employee");
		out.print(emp1.getEid()  +" "+ emp1.getEname() +" "+emp1.getSalary() );

%>

</body>
</html>