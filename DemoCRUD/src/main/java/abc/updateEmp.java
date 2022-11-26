package abc;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateEmp {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factroy=cfg.buildSessionFactory();
		
		Session session= factroy.openSession();
		Transaction tx= session.beginTransaction();
		
		
		Employee e = new Employee();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID :");
		int id=sc.nextInt();
		
		System.out.println("ENter Salary :");
		int salary=sc.nextInt();
		
		e.setId(id);
		e.setSalary(salary);
		
		session.update(e);
		tx.commit();
		
		System.out.println("Data UpDated Succefffully ....!");
		
	}

}
