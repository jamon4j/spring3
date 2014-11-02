package com.zjj.pojo;

public class PersonPo {

	@Override
	public String toString() {
		return "PersonPo [id=" + id + ", name=" + name + "]";
	}
	
	private int id;
	private String name;
	
	public PersonPo() {
		super();
	}
	
	public PersonPo(String name) {
		super();
		this.name = name;
	}
	
	public PersonPo(String name,int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
