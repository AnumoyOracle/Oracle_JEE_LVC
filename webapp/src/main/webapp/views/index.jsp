<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <!-- Declaration Tag -->
   <%!
      
      int a = 10;
      int b = 20;
      int c = 30;
      
      int sum = a + b + c;
      
      int getProduct(int a, int b, int c){
    	  return (a * b * c);
      }
   
   %>
   
   <h3>The sum of three numbers <%= a %> , <%= b %> , <%= c %> is <%= sum %></h3>
   
   <%
   
      int value1 = 10;
	  int value2 = 20;
	  int value3 = 30;
	  
	  int product = getProduct(value1, value2, value3);
   
   %>
   
   <h3>The product of three numbers <%= a %> , <%= b %> , <%= c %> is <%= product %></h3>

</body>
</html>