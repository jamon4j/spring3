package com.zjj.service;

import java.util.List;

import com.zjj.pojo.PersonPo;

public interface IPersonService {
	public void save(PersonPo person);
	public void update(PersonPo person);
	public void delete(Integer personId) throws Exception;
	public PersonPo getPerson(Integer personId);
	public List<PersonPo> getAllPerson();
}
