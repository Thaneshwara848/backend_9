package abc;

import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class GetRecord {
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factroy=cfg.buildSessionFactory();
		
		Session session= factroy.openSession();
		Transaction tx= session.beginTransaction();
		
		List emp =session.createQuery("from Employee").list();
		Iterator i=emp.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			Employee e=(Employee)i.next();
			System.out.println("ID :"+e.getId());
			System.out.println("NAME :"+e.getName());
			System.out.println("AGE :"+e.getAge());
			System.out.println("SALARY :"+e.getSalary());
			System.out.println("DESIG : "+e.getDesig());
			System.out.println("===================================");				
		}
	}
}


