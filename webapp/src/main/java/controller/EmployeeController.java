package controller;

import java.io.IOException;
import java.io.PrintWriter;

import beans.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet{

	public EmployeeController() {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		int eid = Integer.parseInt(req.getParameter("eid"));
		double salary = Double.parseDouble(req.getParameter("salary"));
		String ename = req.getParameter("ename");
		
		Employee emp = new Employee(eid, ename, salary);
		HttpSession session = req.getSession();
		session.setAttribute("emp", emp);
		
		RequestDispatcher rd = req.getRequestDispatcher("/views/success.jsp");
		rd.include(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	

}
