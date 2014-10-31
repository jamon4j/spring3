package com.zjj.web.service;

public interface IUserService {
	void saveUser();
	void saveUserThrowException() throws Exception;
	void findUsers();
}
