package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testhibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails ud=new UserDetails();
		ud.setUserid(101);
		ud.setUsername("FirstUser");
		
		ud.setUserid(102);
		ud.setUsername("SecondUser");
		
		Configuration cfg=new Configuration();
		cfg.configure("first.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.getTransaction();
		t.begin();
		
		s.save(ud);
		t.commit();
		s.close();
		System.out.println("code executed successfully");
		
	}

}
