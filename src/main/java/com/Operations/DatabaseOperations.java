package com.Operations;


import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.*;
import com.contacts.Contacts;
import com.hibernateSettings.HibernateSettings;

public class DatabaseOperations {

	public static int index;
	
	public void addContact(Contacts contact) {
		//Transaction transaction=null;
		Transaction transaction1=null;
		Session sessionObj = null;
		try 
		
		{
			sessionObj = (HibernateSettings.getSessionFactory()).openSession();
            // start a transaction
			System.out.println("this mus print ");
            transaction1 = sessionObj.beginTransaction();
            // save the student object
            sessionObj.save(contact);
            // commit transaction
            transaction1.commit();
            sessionObj.close();
        } catch (Exception e) 
		{
            if (transaction1 != null) 
            {
                transaction1.rollback();
            }
            e.printStackTrace();
        }
		
		
	}
	
	public Contacts getUser(String first) {

        Transaction transaction = null;
        Contacts contact = null;
        try (Session session = HibernateSettings.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Contacts> cq = cb.createQuery(Contacts.class);
            Root<Contacts> root = cq.from(Contacts.class);
            cq.select(root).where(cb.equal(root.get("firstName"), first));
 
            contact = session.createQuery(cq).getSingleResult();


            transaction.commit();

            session.close();
            
        } catch (Exception e) {
            if (transaction != null) 
            {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return contact;
    }
	
	public boolean searchSuccess(String first) {
        boolean val = false;
        Transaction transaction = null;
        Contacts contact = null;
        try (Session session = HibernateSettings.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Contacts> cq = cb.createQuery(Contacts.class);
            Root<Contacts> root = cq.from(Contacts.class);
            cq.select(root).where(cb.equal(root.get("firstName"), first));
 
            contact = session.createQuery(cq).getSingleResult();
            if(contact != null) val = true;

            transaction.commit();

            session.close();
            
        } catch (Exception e) {
            if (transaction != null) 
            {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return val;
    }

	
	public int getIndexOfContact(String first) {
        int val = -1;
        Transaction transaction = null;
        Contacts contact = null;
        try (Session session = HibernateSettings.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            
            CriteriaBuilder cb = session.getCriteriaBuilder();
            CriteriaQuery<Contacts> cq = cb.createQuery(Contacts.class);
            Root<Contacts> root = cq.from(Contacts.class);
            cq.select(root).where(cb.equal(root.get("firstName"), first));
 
            contact = session.createQuery(cq).getSingleResult();
            val = contact.getId();

            transaction.commit();

            session.close();
            
        } catch (Exception e) {
            if (transaction != null) 
            {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return val;
    }

	
	public void modify(Contacts contact) {
		//Transaction transaction=null;
		Transaction transaction1=null;
		Session sessionObj = null;
		try 
		
		{
			sessionObj = (HibernateSettings.getSessionFactory()).openSession();
            // start a transaction
			System.out.println("this mus print ");
            transaction1 = sessionObj.beginTransaction();
            // save the student object
            sessionObj.update(contact);
            // commit transaction
            transaction1.commit();
            sessionObj.close();
        } catch (Exception e) 
		{
            if (transaction1 != null) 
            {
                transaction1.rollback();
            }
            e.printStackTrace();
        }
		
    }

	public void updateUser(Contacts contact) {
        Transaction transaction = null;
        try (Session session = HibernateSettings.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(contact);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
	
	 public void deleteUser(Contacts contact) {

	        Transaction transaction = null;
	        try (Session session = HibernateSettings.getSessionFactory().openSession()) {
	            // start a transaction
	            transaction = session.beginTransaction();

	            // Delete a user object
	            
	            if (contact != null) {
	                session.delete(contact);
	                System.out.println("user is deleted");
	            }

	            // commit transaction
	            transaction.commit();
	        } catch (Exception e) {
	            if (transaction != null) {
	                transaction.rollback();
	            }
	            e.printStackTrace();
	        }
	    }
	 

}
