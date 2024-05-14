package com.reddy.SpringORM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Component
public class AnimalDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Animal> getAnimals() {
		Session session=sessionFactory.getCurrentSession();
		List<Animal> list=session.createQuery("from Animal",Animal.class).list();
		return list;
	}
	
	@Transactional
	public void addAnimal(Animal a) {
		Session session=sessionFactory.getCurrentSession();
		session.save(a);	
		}
	
	@Transactional
	public Animal getAnimal(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.find(Animal.class, id);
	}

}
