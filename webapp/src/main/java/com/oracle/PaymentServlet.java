package com.oracle;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Payment Servlet Entry ... </h1>");
		Integer amountCredited = (Integer)req.getAttribute("amountCredited");
		ServletContext application = req.getServletContext();
		Integer amountDebited = (Integer)application.getAttribute("amountDebited");
		HttpSession session = req.getSession();
		Integer totalAmount = (Integer)session.getAttribute("totalAmount");
		out.println("<h3>Amount credited : " + amountCredited + "</h3>");
		out.println("<h3>Amount debited : " + amountDebited + "</h3>");
		out.println("<h3>Total Amount : " + totalAmount + "</h3>");
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Payment Servlet</h1>");
		Integer number = (Integer)req.getAttribute("number");
		out.println("<h3>Sum of two numbers : " + number + " </h3>");
		
	}

}
