package com.zjj.hello.impl;

import com.zjj.hello.HelloApi;

public class HelloImpl implements HelloApi{
	private String name;
	private int age;
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	/*public HelloImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}*/
	@Override
	public String helloSpring(int a) {
		return "this is HelloImpl "+ a + "---name:" + name;
	}

	
}
