package com.zjj.web.springJdbc;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zjj.web.service.IUserService;

public class SpringJdbcTest {
	private static ApplicationContext ctx = null;
	@BeforeClass
	public static void onlyOnce(){
		ctx = new ClassPathXmlApplicationContext("applicationContext-jdbc.xml");
	}
	
	/*@Test
	public void testSave(){
		IUserService userService = ctx.getBean("userService",IUserService.class);
		userService.saveUser();
	}*/
	
	/*@Test
	public void testSaveThrowException() throws Exception{
		IUserService userService = ctx.getBean("userService",IUserService.class);
		userService.saveUserThrowException();
	}*/
	
	@Test
	public void testJdbcDaoQuery(){
		IUserService userService = ctx.getBean("userService",IUserService.class);
		userService.findUsers();
	}
}
