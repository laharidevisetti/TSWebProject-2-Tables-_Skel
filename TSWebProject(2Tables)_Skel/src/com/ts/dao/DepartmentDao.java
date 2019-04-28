package com.ts.dao;
import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Dept;
import com.ts.dto.Employee;
public class DepartmentDao {
	private SessionFactory factory = null;
	public static int register(Dept d) {
		return HibernateTemplate.addObject(d);
	}

	public static List<Dept> getAllDepartments() {
		List<Dept> d1=(List)HibernateTemplate.getObjectListByQuery("From Dept");
		System.out.println("Inside All Employees ..."+d1);
		return d1;	
	}
	public Dept getDepartmentById(int id) {
		return (Dept)HibernateTemplate.getObject(Dept.class,id);
	}

	
}
