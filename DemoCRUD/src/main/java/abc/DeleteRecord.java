package abc;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();
		
		Transaction tx= session.beginTransaction();
		
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID to Delete :");
		int id=sc.nextInt();
		
		e.setId(id);
		
		System.out.println("Really do you want to DELTE ? Y/N");
		String op=sc.next();
		if(op.equalsIgnoreCase("YES")|| op.equalsIgnoreCase("Y"))
		{
			session.delete(e);
			tx.commit();
			System.out.println("Data Deleted Succesfully...!");
		}
		else {
			System.out.println("Not deleted.....!");
		}	
	}
}

