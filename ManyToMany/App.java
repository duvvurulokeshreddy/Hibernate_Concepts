package ManyToMany;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		Students s1=new Students();
		s1.setStudentId(4007);
		s1.setStudentName("Lokesh");
		s1.setMarks(85);
		s1.setAddress("Naidupeta");
		
		Students s2=new Students();
		s2.setStudentId(4006);
		s2.setStudentName("Vishnu");
		s2.setMarks(78);
		s2.setAddress("Nellore");
		
		Colleges c1=new Colleges();
		c1.setCollegeId(1107);
		c1.setCollegeName("JNN institute of Technology");
		c1.setHighestMarks(90);
		
		Colleges c2=new Colleges();
		c2.setCollegeId(3121);
		c2.setCollegeName("Smk Fomra Istitute Of Technology");
		c2.setHighestMarks(88);
		
		c1.setDlist(Arrays.asList(s2));
		c2.setDlist(Arrays.asList(s1));
		
		s1.setClist(Arrays.asList(c2));
		s2.setClist(Arrays.asList(c1));
		
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Colleges.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction trans=session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(c1);
		session.save(c2);
		trans.commit();
	}

}
