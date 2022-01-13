package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Class use to get session
 *
 * @author Samuel Saint-Omer
 */
public final class SessionHelper {

    private SessionHelper(){
        //Do not instantiate
    }

    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("config/hibernate.cfg.xml");
            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * Get session from factory
     * @return the session for database
     * @throws HibernateException if some problem in session opening
     */
    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

}
