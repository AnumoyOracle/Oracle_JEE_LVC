package controller;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import entity.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utility.Util;

public class DisplayController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EntityManager entityManager = Util.getEntityManager();
		TypedQuery<Employee> query = entityManager.createQuery("select e from Employee e", Employee.class);
		List<Employee> employees = query.getResultList();
		HttpSession session = req.getSession();
		session.setAttribute("employeeList", employees);
		RequestDispatcher rDispatcher = req.getRequestDispatcher("/views/display.jsp");
		rDispatcher.include(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
