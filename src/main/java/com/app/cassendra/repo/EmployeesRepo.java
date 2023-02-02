package com.app.cassendra.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.app.cassendra.entity.Employees;

public interface EmployeesRepo  extends  CassandraRepository <Employees,UUID> {

	@AllowFiltering
public Employees findByName(String name);
}
