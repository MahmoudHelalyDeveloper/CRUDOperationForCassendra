package com.app.cassendra.entity;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import jnr.ffi.Struct.int16_t;

@Table()

public class Employees implements Serializable {

	@PrimaryKey
	private UUID id;
	
	
	private String name;


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
