package com.zjj.web.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zjj.web.dao.IUserDao;
import com.zjj.web.po.User;
import com.zjj.web.service.IUserService;

@Transactional
public class UserService implements IUserService {
	private IUserDao userDao;
	
	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}

	public void saveUser() {
		User u1 = new User();
		u1.setName("zjj");
		u1.setAge(22);
		userDao.save(u1);
		
		if(1+1>1){
			throw new RuntimeException("Runtime error...");
		}
		
		User u2 = new User();
		u1.setName("kk");
		u1.setAge(31);
		userDao.save(u2);
	}

	public void saveUserThrowException() throws Exception {
		User u1 = new User();
		u1.setName("zjjex");
		u1.setAge(22);
		userDao.save(u1);
		
		if(1+1>1){
			throw new Exception("Runtime error...ex");
		}
		
		User u2 = new User();
		u1.setName("kkex");
		u1.setAge(31);
		userDao.save(u2);
	}

	@Transactional(propagation=Propagation.NOT_SUPPORTED,readOnly=true)
	public void findUsers() {	
		List<User> users = userDao.query("select * from user where age>?", new Object[]{22});
		for(User user:users)
		{
			System.out.println(user);
		}
	}

}
