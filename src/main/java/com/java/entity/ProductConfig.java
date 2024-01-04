package com.java.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProductConfig {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("product.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tc=session.beginTransaction();
		
		Product p=new Product();
		p.setPid(2);
		p.setName("Earphone");
		p.setPrice(2500);
		session.save(p);
		tc.commit();
		

	}

}