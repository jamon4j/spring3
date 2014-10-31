package com.zjj.aop;

import java.lang.reflect.Method;

import com.zjj.service.impl.PersonService;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxyFactory implements MethodInterceptor{
	private Object targetObject;
	
	public Object createProxyInstance(Object targetObejct) {
		this.targetObject = targetObejct;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetObejct.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		PersonService personService = (PersonService) this.targetObject;
		Object result = null;
		if(personService.getName()!=null) {
			result = methodProxy.invoke(targetObject, args);
		}
		return result;
	}
	
}
