package com.app.cassendra.service;

import java.util.List;

import com.app.cassendra.entity.Employees;

public abstract class EmployeesService { 
	
	public abstract Employees addEmployees(Employees employees);
	
	public abstract List<Employees> getEmployees();
	
	public abstract Employees updateEmployees(Employees employees);
	
	public abstract void deleteEmployees(Employees employees);
	
	
	
	public abstract Employees getEmployeeByName(String name);

	

}
