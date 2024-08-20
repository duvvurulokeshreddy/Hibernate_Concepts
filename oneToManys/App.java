package oneToManys;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Patient p1=new Patient();
		p1.setPatientName("Ramesh");
		p1.setPatientAge(22);
		p1.setPatientMobileNumber(879467961L);
		p1.setPatientAddress("Gooty");
		
		
		HosptialRoom h1=new HosptialRoom();
		h1.setHosptialId(101);
		h1.setHosptialName("Srinagar Hosptial");
		h1.setDoctorName("Sai");
		
		HosptialRoom h2=new HosptialRoom();
		h2.setHosptialId(102);
		h2.setHosptialName("Sridevi Hosptial");
		h2.setDoctorName("Snesha");
		
		HosptialRoom h3=new HosptialRoom();
		h3.setHosptialId(103);
		h3.setHosptialName("Myr Hosptial");
		h3.setDoctorName("Kiran");
		
		p1.setDlist(Arrays.asList(h1,h2,h3));
		
		
		
		Configuration cfg=new Configuration().
				configure().
				addAnnotatedClass(Patient.class).
				addAnnotatedClass(HosptialRoom.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.save(p1);
		session.save(h1);
		session.save(h2);
		session.save(h3);
		trans.commit();
		
	}

}

//Patient p2=new Patient();
//p2.setPatientName("Raju");
//p2.setPatientAge(29);
//p2.setPatientMobileNumber(796346776L);
//p2.setPatientAddress("Gooty");
//
//Patient p3=new Patient();
//p3.setPatientName("Rajesh");
//p3.setPatientAge(22);
//p3.setPatientMobileNumber(7647964678L);
//p3.setPatientAddress("Gooty");
