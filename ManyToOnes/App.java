package ManyToOnes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Man m1=new Man();
		m1.setManId(101);
		m1.setManName("Lokesh");
		m1.setManAge(23);
		
		Man m2=new Man();
		m2.setManId(102);
		m2.setManName("Rakesh");
		m2.setManAge(23);
		
		Car c1=new Car();
		c1.setCarId(98764);
		c1.setCarName("BMW");
		
		Car c2=new Car();
		c2.setCarId(6413);
		c2.setCarName("Audi");
		
		m1.setCar(c2);
		m2.setCar(c1);
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Man.class).addAnnotatedClass(Car.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.save(m1);
		session.save(m2);
		session.save(c1);
		session.save(c1);
		session.save(c2);
		trans.commit();
	}

}
