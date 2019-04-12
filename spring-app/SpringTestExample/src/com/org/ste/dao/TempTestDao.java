package com.org.ste.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TempTestDao {
	
	private static SessionFactory factory;
	static{
		
		try{
			
			System.out.println("Inside");
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			System.out.println("after config properties");
			factory = configuration.buildSessionFactory();
			System.out.println("after session factory");
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		
	}
	
	public static SessionFactory getSessionFactory(){
		
		return factory;
		
	}
	
	public Session getSessionObj(){
		
		Session session = null;
		
		try{
			
			if(factory != null && !factory.isClosed()){
				
				session = factory.openSession();
				
			}
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return session;
		
	}
	
	public boolean commit(Session session){
		
		Transaction tx = null;
		
		try{
			
		//	session.flush();
			tx = session.getTransaction();
			tx.commit();
			
			return true;
			
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return false;
		
	}
	
	
	
}
