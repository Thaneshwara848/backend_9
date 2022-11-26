package abc;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecord {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factroy=cfg.buildSessionFactory();
		
		Session session= factroy.openSession();
		
		Transaction tx= session.beginTransaction();
		
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID : ");
		int uid=sc.nextInt();
		
		System.out.println("Enter NAME  : ");
		String name=sc.next();
		
		
		System.out.println("Enter AGE : ");
		int age=sc.nextInt();
		
		
		System.out.println("Enter SAalry : ");
		int salary=sc.nextInt();
		
		
		System.out.println("Enter Desig : ");
		String  desig=sc.next();
		
		
		
		e.setId(uid);
		e.setName(name);
		e.setAge(age);
		e.setSalary(salary);
		e.setDesig(desig);
		
		session.save(e);
		tx.commit();
		
		System.out.println("Data Inserted ...!");
	}

}
//https://github.com/Thaneshwara848/backend_9.git
//import and execute in 5 minuts . i'll be back '


