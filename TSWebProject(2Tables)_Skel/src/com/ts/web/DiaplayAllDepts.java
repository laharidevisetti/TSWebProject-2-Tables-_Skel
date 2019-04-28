package com.ts.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ts.dao.DepartmentDao;
import com.ts.dao.EmployeeDAO;
import com.ts.dto.Dept;
import com.ts.dto.Employee;


@WebServlet("/DiaplayAllDepts")
public class DiaplayAllDepts extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();		
		DepartmentDao deptDAO = new DepartmentDao();
		List<Dept> arrayList = DepartmentDao.getAllDepartments();

		request.setAttribute("DepartmentsData", arrayList);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayAllDept.jsp");
		rd.forward(request, response);		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}