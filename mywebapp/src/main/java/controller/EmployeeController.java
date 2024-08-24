package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;

import entity.Employee;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import utility.Util;

public class EmployeeController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		EntityManager entityManager = Util.getEntityManager();

		// Check if there's an existing transaction
		if (!entityManager.getTransaction().isActive()) {
			entityManager.getTransaction().begin();
		}

		try {
			int eid = Integer.parseInt(req.getParameter("eid"));
			String ename = req.getParameter("ename");
			double salary = Double.parseDouble(req.getParameter("salary"));

			System.out.println(eid + " " + ename + " " + salary);

			Employee employee = new Employee();
			employee.setEid(eid);
			employee.setEname(ename);
			employee.setSalary(salary);

			entityManager.persist(employee);

			entityManager.getTransaction().commit();

			HttpSession session = req.getSession();
			session.setAttribute("employee", employee);
			RequestDispatcher rd = req.getRequestDispatcher("/views/success.jsp");
			rd.include(req, resp);
		} catch (Exception e) {
			// Rollback the transaction in case of an error
			if (entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().rollback();
			}
			throw new ServletException(e);
		} finally {
			out.close();
			entityManager.close(); // Close EntityManager to avoid resource leaks
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
