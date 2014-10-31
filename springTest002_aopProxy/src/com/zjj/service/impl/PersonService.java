package com.zjj.service.impl;

import com.zjj.service.IPersonService;

public class PersonService implements IPersonService{
	private String name;
	
	public String getName() {
		return name;
	}

	public PersonService() {
		super();
	}
	
	public PersonService(String name) {
		super();
		this.name = name;
	}
	
	public void save() {
		System.out.println(name +",this is save() method!");
	}
	
	public void add() {
		System.out.println(name +",this is add() method!");
	}
}
