package com.zjj.spring3.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.zjj.spring3.aop.testAopApi;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		testAopApi taa = (testAopApi) context.getBean("testAopApi");
		String result = taa.testAop();
		System.out.println("result:" + result);
	}

}
