package hibernate;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import com.Operations.DatabaseOperations;
import com.contacts.Contacts;

import org.junit.Assert;

public class DatabaseOperationsTest {
	
	   private static SessionFactory sf;
	    private static Session s;
	    private static Transaction tx; 
	    
	    @BeforeClass
	    public static void setUp() {
	    	
	    sf = new AnnotationConfiguration().configure().buildSessionFactory();

	    }
	    
	    @Before
	    public void open() {
	        s = sf.openSession();
	        tx = s.beginTransaction();
	    }
	    
	@Test
	public void addContactsTest() {
		
		DatabaseOperations db = new DatabaseOperations();
		Contacts contact1 = new Contacts(1, "aaa", "bbb");
		db.addContact(contact1);
		Assert.assertTrue("index values are equal", contact1.getId() == db.getIndexOfContact("aaa"));
		
		
		
	}
	
	@After
    public void close() {
        tx.commit();
        s.close();
    }
	
	@AfterClass
    public static void tearDown() {
        sf.close();
    }
	
	

}
