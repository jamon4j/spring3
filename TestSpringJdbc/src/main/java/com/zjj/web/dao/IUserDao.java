package com.zjj.web.dao;

import java.util.List;

import com.zjj.web.po.User;

public interface IUserDao {
	public void save(User user);
	public List<User> query(String sql,Object[] args);
}
