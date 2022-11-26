package abc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class EmpProj
{
	static void insert()
	{
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
	static void display()
	{
		
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
	static void update() 
	{
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
	static void delete()
	{
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
public class Project {

	public static void main(String[] args) {
		
		int ch=0;
		do {
			System.out.println("1 ) Insert ");
			System.out.println("2 ) Display ");
			System.out.println("3 ) Udpate ");
			System.out.println("4 ) Delete ");

			Scanner sc = new Scanner(System.in);
			System.out.println("ENter The Choise ");
			ch=sc.nextInt();
			if(ch==1) 
			{
				EmpProj.insert();
			}
			if(ch==2) 
			{
				EmpProj.display();
			}
			if(ch==3) 
			{
				EmpProj.update();
			}
			if(ch==4) 
			{
				EmpProj.delete();
			}
		}while(ch<=4);
	}
}
