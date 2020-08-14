package com.ejerciciopoo.main;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ejerciciopoo.entidades.cliente;
import com.ejerciciopoo.entidades.pais;




public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	

	public static void main(String[] args) {
		
		cliente cli1 = new cliente("Ernesto","Arteaga");
		ingresarCliente(cli1);
		cliente cli2 = new cliente("Nelson","Mandela");
		ingresarCliente(cli2);
		
		
		pais pa1 = new pais("Ecuador");
		ingresarPais(pa1);
		pais pa2= new pais("Venezuela");
		ingresarPais(pa2);
		
	
		
	}
	static void ingresarCliente(cliente cli) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(cli);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarPais(pais pa) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pa);
		session.getTransaction().commit();
		session.close();
	}
	
	


	


}
