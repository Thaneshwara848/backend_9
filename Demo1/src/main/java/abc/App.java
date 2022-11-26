package abc;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
//		<hibernate-configuration>
//	    <session-factory name="demo">
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factroy=cfg.buildSessionFactory();
		
		Session session= factroy.openSession();
		
		org.hibernate.Transaction tx= session.beginTransaction();
		
		Employee e = new Employee();
		e.setId(100);
		e.setName("Thanesh");
		e.setAge(25);
		e.setSalary(50000);
		e.setDesig("Trainer");
		
		session.save(e);
		tx.commit();
		
		System.out.println("Data Inserted ...!");
	}

}
//https://github.com/Thaneshwara848/backend_9.git
//import and execute in 5 minuts . i'll be back '


