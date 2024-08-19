package com.oracle;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FourthServlet implements Servlet{
	
	private ServletConfig config = null;

	@Override
	public void destroy() {
		System.out.println("Servlet is destroyed...");
	}

	@Override
	public ServletConfig getServletConfig() {
		return this.config;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		this.config = servletConfig;
		System.out.println("Servlet is initialized...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		System.out.println("Servicing ...");
		out.println("<h2>Hello World</h2>");
		out.println("<h3>Concept of Servlet interface</h3>");
		out.close();
	}

}
