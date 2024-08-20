package oneToOnes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setPersonId(101);
		p1.setPersonName("Lokesh");
		p1.setPersonMobileNumber(6309393449L);
		p1.setAddress("Madapalem");
		
		Person p2=new Person();
		p2.setPersonId(102);
		p2.setPersonName("Manoj");
		p2.setPersonMobileNumber(8918551467L);
		p2.setAddress("Gudur");
		
		Person p3=new Person();
		p3.setPersonId(103);
		p3.setPersonName("Santhosh");
		p3.setPersonMobileNumber(63037944L);
		p3.setAddress("Naidupeta");
		
		PanCardVerfication v1=new PanCardVerfication();
		v1.setAdharCardId(897);
		v1.setName("Santhosh");
		v1.setDocuments("12th mark sheet");
		
		PanCardVerfication v2=new PanCardVerfication();
		v2.setAdharCardId(899);
		v2.setName("Lokesh");
		v2.setDocuments("10th mark sheet");
		
		PanCardVerfication v3=new PanCardVerfication();
		v3.setAdharCardId(891);
		v3.setName("Maonz");
		v3.setDocuments("Btech mark sheet");
		
		p1.setPan(v2);
		p2.setPan(v3);
		p3.setPan(v1);
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(PanCardVerfication.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(v1);
		session.save(v2);
		session.save(v3);
		trans.commit();
	}

}
