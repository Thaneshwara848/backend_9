package com;

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

		Student e = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID :");int uid=sc.nextInt();
		System.out.print("Enter NAME :");String uname=sc.next();
		System.out.print("Enter MARKS :");int umarks=sc.nextInt();
		System.out.print("Enter CITY:");String ucity=sc.next();
		e.setRid(uid);
		e.setUname(uname);
		e.setMarks(umarks);
		e.setCity(ucity);
		
		session.save(e);
		tx.commit();
		
		System.out.println("Inserted ..........!");
		

		
		
	}

}
