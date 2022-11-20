package emp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID :");int uid=sc.nextInt();
		System.out.print("Enter NAME :");String uname=sc.next();
		System.out.print("Enter AGE :");int uage=sc.nextInt();
		System.out.print("Enter SALARY:");int usalary=sc.nextInt();
		System.out.print("Enter DESIG:");String udesig=sc.next();
		e.setUid(uid);
		e.setName(uname);
		e.setAge(uage);
		e.setSalary(usalary);
		e.setDesig(udesig);
		
		session.save(e);
		tx.commit();
		
		System.out.println("Inserted ..........!");
		

	}

}
