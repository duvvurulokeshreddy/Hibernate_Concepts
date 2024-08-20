package com.jsp.hibernate.HotelParticePrograms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        HotelsBookings bs=new HotelsBookings();
        bs.setHotelId(101);
        bs.setHotelName("Novtel");
        bs.setBookingCost(2000);
        bs.setLocation("Bangalore");
        
        HotelsBookings bs1=new HotelsBookings();
        bs1.setHotelId(102);
        bs1.setHotelName("Sridevi");
        bs1.setBookingCost(300);
        bs1.setLocation("Srinagar");
        
        Configuration cf=new Configuration();
        cf.configure();
        cf.addAnnotatedClass(HotelsBookings.class);
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction trans=session.beginTransaction();
        session.save(bs);
        session.save(bs1);
        trans.commit();
        
    }
}
