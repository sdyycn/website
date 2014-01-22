package cn.cms.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {
//	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";
	private static SessionFactory sessionFactory;
    private static Session session;
//    private static String configFile = CONFIG_FILE_LOCATION;
    private  static Configuration cfg = new Configuration();

    static {
        try {
            cfg.configure();
            ServiceRegistry  sr = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();           
            sessionFactory = cfg.buildSessionFactory(sr);
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    

    // session.beginTransaction();
    // session.getTransaction().commit();
    // session.getTransaction().roolback();
    public static Session getSession() throws HibernateException {
       if (session == null || !session.isOpen()) {
           session = sessionFactory.openSession();
       }
 
        return session;
    }
    
    public static void closeSession() throws HibernateException {
        if (session != null) {
            session.close();
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static void setSessionFactory(SessionFactory sessionFactory){
    	HibernateUtil.sessionFactory = sessionFactory;
    }

}