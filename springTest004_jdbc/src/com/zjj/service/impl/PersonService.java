package com.zjj.service.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.zjj.pojo.PersonPo;
import com.zjj.service.IPersonService;

@Transactional
public class PersonService implements IPersonService{
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void save(PersonPo person) {
		jdbcTemplate.update("insert into person(personName) values(?)", new Object[]{person.getName()});
	}

	@Override
	public void update(PersonPo person) {
		jdbcTemplate.update("update person set personName = ? where personId = ?",new Object[]{person.getName(),person.getId()});
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void delete(Integer personId) throws Exception{
		jdbcTemplate.update("delete from person where personId = ?",new Object[]{personId});
		throw new Exception("运行期例外");
	}

	@Override
	public PersonPo getPerson(Integer personId) {
		return (PersonPo) jdbcTemplate.queryForObject("select * from person where personId = ?", new Object[]{personId}, 
				new int[]{java.sql.Types.INTEGER}, new PersonRowMapper());
	}

	@Override
	public List<PersonPo> getAllPerson() {
		return (List<PersonPo>) jdbcTemplate.query("select * from person",new PersonRowMapper());
	}
	
}
