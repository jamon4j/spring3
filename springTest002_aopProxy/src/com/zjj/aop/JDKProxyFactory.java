package com.zjj.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.zjj.service.impl.PersonService;

public class JDKProxyFactory implements InvocationHandler{
	private Object targetObject;
	
	public Object createProxyInstance(Object targerObject) {
		this.targetObject = targerObject;
		return Proxy.newProxyInstance(this.targetObject.getClass().getClassLoader(),
				this.targetObject.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		PersonService personService = (PersonService) this.targetObject;
		Object result = null;
		if(personService.getName()!=null) {
			result = method.invoke(targetObject, args);
		}
		return result;
	}
}
