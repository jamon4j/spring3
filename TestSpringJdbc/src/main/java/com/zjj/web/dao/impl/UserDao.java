package com.zjj.web.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;




import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.zjj.web.dao.IUserDao;
import com.zjj.web.po.User;

public class UserDao extends JdbcDaoSupport implements IUserDao{

	class UserRowMapper implements RowMapper<User> {

		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User u = new User();
			u.setId(rs.getLong("user_id"));
			u.setName(rs.getString("username"));
			u.setAge(rs.getInt("age"));
			return u;
		}
		
	}
	
	public void save(User user) {
		getJdbcTemplate().update("insert into user(username,age) values(?,?)",user.getName(),user.getAge());
		
	}

	public List<User> query(String sql, Object[] args) {
		return getJdbcTemplate().query(sql, args, new UserRowMapper());
	}
	
}	
