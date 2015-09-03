package dao;

import pojos.UserData;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.*;
import utils.HibernateUtils;


/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Sep 28, 2011
 * Time: 3:10:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDatadao {
    Session s= null;
    Transaction t=null;
    public boolean saveUser(UserData ud){
        try {
            System.out.println("user: "+ud);
                s= HibernateUtils.getSessionFactory().openSession();
                   t=s.beginTransaction();
            if(ud!=null){
                System.out.println("ud is not null, inside if");
                s.save(ud);
                t.commit();
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally{
            s.close();
        }

    }


    public boolean getupdate(UserData ud){
             try {
            System.out.println("user: "+ud);
                s= HibernateUtils.getSessionFactory().openSession();
                   t=s.beginTransaction();
                  String hql="from UserData where id=3";

           UserData lp=(UserData)s.createQuery(hql).uniqueResult();
            if(lp!=null){
                System.out.println("ud is not null, inside if");
                lp.setFirstname(ud.getFirstname());
                lp.setLastname(ud.getLastname());    
                s.saveOrUpdate(lp);
                t.commit();
                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }finally{
            s.close();
        }

    }

    }
