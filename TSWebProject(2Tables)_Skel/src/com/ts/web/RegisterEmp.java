package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.EmployeeDAO;
import com.ts.dto.Dept;
import com.ts.dto.Employee;

@WebServlet("/RegisterEmp")
public class RegisterEmp extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		double salary = Double.parseDouble(request.getParameter("salary"));
		String job = request.getParameter("job");
		String user = request.getParameter("uid");
		String pass = request.getParameter("pwd");		
		int deptId = Integer.parseInt(request.getParameter("deptId"));
		Dept dept = new Dept();
		dept.setDeptId(deptId);
		Employee employee = new Employee(name,salary,job,user,pass,dept);		
		EmployeeDAO employeeDao = new EmployeeDAO();
		int x = employeeDao.register(employee);
		RequestDispatcher rd = request.getRequestDispatcher("Login.html");
		rd.include(request, response);
	  out.println("<h3><CENTER>Registration Success .."+x+" Rows inserted...</CENTER></H3>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

