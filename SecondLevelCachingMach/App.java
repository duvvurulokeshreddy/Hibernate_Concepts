package SecondLevelCachingMach;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Institute.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		Institute i1 = session.get(Institute.class, 101);
		Institute i2 = session.get(Institute.class, 101);
		Institute i3 = session.get(Institute.class, 102);
		Institute i4 = session.get(Institute.class, 103);
		session.save(i1);
		session.save(i2);
		session.save(i3);
		session.save(i4);
		trans.commit();
		System.out.println("------------------------------------");
		
		SessionFactory sf1=cfg.buildSessionFactory();
		Session session1=sf1.openSession();
		Transaction trans1=session1.beginTransaction();
		Institute i5 = session1.get(Institute.class, 102);
		Institute i6 = session1.get(Institute.class, 103);
		Institute i7 = session1.get(Institute.class, 104);
		Institute i8 = session1.get(Institute.class, 103);
		session1.save(i5);
		session1.save(i6);
		session1.save(i7);
		session1.save(i8);
		trans1.commit();
		
	}

}
