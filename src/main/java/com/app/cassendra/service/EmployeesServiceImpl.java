package com.app.cassendra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.cassendra.entity.Employees;
import com.app.cassendra.repo.EmployeesRepo;
import com.datastax.oss.driver.api.core.uuid.Uuids;
@Service
public class EmployeesServiceImpl extends EmployeesService {
	
	@Autowired
	private EmployeesRepo employeesRepo;
	
	@Override
	public Employees addEmployees(Employees employees) {
		// TODO Auto-generated method stub
		employees.setId(Uuids.timeBased() );
		return this.employeesRepo.save(employees);
	}
	
	@Override
	public Employees getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return this.employeesRepo.findByName(name);
	}
	@Override
	public List<Employees> getEmployees() {
		// TODO Auto-generated method stub
		return this.employeesRepo.findAll();
	}
	@Override
	public Employees updateEmployees(Employees employees) {
		// TODO Auto-generated method stub
		return this.employeesRepo.save(employees);
	} 
	@Override
	public void deleteEmployees(Employees employees) {
		// TODO Auto-generated method stub
		this.employeesRepo.delete(employees);
	}

}
