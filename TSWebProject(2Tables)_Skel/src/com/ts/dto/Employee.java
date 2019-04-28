package com.ts.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id@GeneratedValue
	private int empId;
	@Column(length=25)
	private String name;
	@Column(length=25)
	private double salary;
	@Column(length=25)
	private String job;
	@Column(length=25)
	private String userName;
	@Column(length=25)
	private String password;
	
	@ManyToOne
	@JoinColumn(name="DEPT_ID")
	private Dept dept;
	
	
	public Employee() {
		super();	
	}
	
	public Employee(String name, double salary, String job, String userName, String password, Dept dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.job = job;
		this.userName = userName;
		this.password = password;
		this.dept = dept;
	}
	
	public Employee(int empId, String name, double salary, String job, String userName, String password, Dept dept) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.job = job;
		this.userName = userName;
		this.password = password;
		this.dept = dept;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
