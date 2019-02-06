package com.tlgtmc.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tlgtmc.hibernate.demo.entity.Employee;


public class CreateEmployee {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee emp = new Employee("Andore", "Gonzales", "IMA");
		
		session.save(emp);
		
		session.getTransaction().commit();
		
	}

}
