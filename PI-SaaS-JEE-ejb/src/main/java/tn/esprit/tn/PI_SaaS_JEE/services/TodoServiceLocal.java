package tn.esprit.tn.PI_SaaS_JEE.services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.tn.PI_SaaS_JEE.persistence.Todo;

@Local
public interface TodoServiceLocal {
	
	void create(Todo todo);
	List<Todo> findAll();

}
