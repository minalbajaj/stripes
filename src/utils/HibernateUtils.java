package utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Sep 28, 2011
 * Time: 1:58:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateUtils {
              public static SessionFactory sf;
    
         public static SessionFactory getSessionFactory(){

             if(sf==null) {
                  System.out.println("in session factory");
                 Configuration cfg=new AnnotationConfiguration();
                 sf=cfg.configure().buildSessionFactory();


             }
                     return sf;

             
         }



}
