package FirstLevelCachingMach;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Mobile.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Mobile m1=session.get(Mobile.class, 101);
		Mobile m2=session.get(Mobile.class, 102);
		Mobile m3=session.get(Mobile.class, 101);
		session.save(m1);
		session.save(m2);
		session.save(m3);
		trans.commit();
		System.out.println("----------------------------------");
		SessionFactory sf2=cfg.buildSessionFactory();
		Session session2=sf2.openSession();
		Transaction trans2=session2.beginTransaction();
		Mobile m4=session2.get(Mobile.class, 103);
		Mobile m5=session2.get(Mobile.class, 101);
		Mobile m6=session2.get(Mobile.class, 104);
		Mobile m7=session2.get(Mobile.class, 101);
		session2.save(m4);
		session2.save(m5);
		session2.save(m6);
		session2.save(m7);
		trans2.commit();
	}

}
