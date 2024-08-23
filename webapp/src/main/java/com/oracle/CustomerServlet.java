package com.oracle;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Customer Servlet</h1>");
		String num1String = req.getParameter("num1");
		String num2String = req.getParameter("num2");
		Integer num1 = Integer.parseInt(num1String);
		Integer num2 = Integer.parseInt(num2String);
		
		req.setAttribute("number", num1 + num2);
		RequestDispatcher rd = req.getRequestDispatcher("PaymentServlet");
		rd.forward(req, resp);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Customer Servlet Entry ... </h1>");
		req.setAttribute("amountCredited", 100000);
		ServletContext application = req.getServletContext();
		application.setAttribute("amountDebited", 20000);
		HttpSession session = req.getSession();
		session.setAttribute("totalAmount", 120000);
		RequestDispatcher rd = req.getRequestDispatcher("PaymentServlet");
//		rd.include(req, resp);
		rd.forward(req, resp);
		out.close();
	}
	
	
	

}
