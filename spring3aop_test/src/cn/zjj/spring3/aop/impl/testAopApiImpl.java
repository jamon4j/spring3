package cn.zjj.spring3.aop.impl;

import cn.zjj.spring3.aop.testAopApi;

public class testAopApiImpl implements testAopApi {

	@Override
	public String testAop() {
		System.out.println("this is Class testAop!");
		return "return from Class testAop!";
	}

}
