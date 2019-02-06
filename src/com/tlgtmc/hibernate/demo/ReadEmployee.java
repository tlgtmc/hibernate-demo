package com.tlgtmc.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tlgtmc.hibernate.demo.entity.Employee;


public class ReadEmployee {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		Employee employee = session.get(Employee.class, 1);
		
		System.out.println(employee);
		
		session.getTransaction().commit();
		
	}

}
