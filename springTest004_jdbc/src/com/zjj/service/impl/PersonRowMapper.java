package com.zjj.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.zjj.pojo.PersonPo;

public class PersonRowMapper implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int index) throws SQLException {
		PersonPo person = new PersonPo();
		person.setId(rs.getInt("personId"));
		person.setName(rs.getString("personName"));
		return person;
	}
}
