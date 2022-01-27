package com.example.database.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.database.entity.Person;

//Repository
//Transaction
@Repository
@Transactional
public class PersonJpaRepository {
	
	//connectto database
	@PersistenceContext
	EntityManager entityManagaer;
	
	public List<Person> findAll(){
		TypedQuery<Person> namedQuery=entityManagaer.createNamedQuery("find_all_persons", Person.class);
		return namedQuery.getResultList();
		
		
	}
	
	public Person findById(int id) {
		return entityManagaer.find(Person.class, id);
	}
	
	public Person update(Person person) {
		return entityManagaer.merge(person);
	}
	
	public Person insert(Person person) {
		return entityManagaer.merge(person);
	}
	
	public void deleteByid(int id) {
		Person p=findById(id);
		 entityManagaer.remove(p);
		
	}

}
