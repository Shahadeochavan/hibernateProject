package org.nexTech.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;
import org.nexTech.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("first user");
		SessionFactory sessionfactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		

	}

}
