package action;

import net.sourceforge.stripes.action.*;
import net.sourceforge.stripes.controller.FlashScope;

import javax.persistence.PersistenceContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletContext;
import java.util.List;
import java.util.ArrayList;

import pojos.UserData;
import dao.UserDatadao;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Sep 28, 2011
 * Time: 12:59:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserActionBean implements ActionBean {

    private ActionBeanContext context;

    private String firstname;
    private String lastname;
       private UserData ud;
    private UserDatadao dao;
     private List<UserData> l=null;

    public UserData getUd() {
        return ud;
    }

    public void setUd(UserData ud) {
        this.ud = ud;
    }

    public UserDatadao getDao() {
        return dao;
    }

    public void setDao(UserDatadao dao) {
        this.dao = dao;
    }

    public List<UserData> getL() {
        return l;
    }

    public void setL(List<UserData> l) {
        this.l = l;
    }

    public ActionBeanContext getContext() {
        return context;
    }

    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
         @DefaultHandler
        public Resolution update() {
            dao=new UserDatadao();
            l=new ArrayList<UserData>();
            ud=new UserData(firstname,lastname);
            l.add(ud);
            System.out.println("inside update: "+ud);

            if( dao.saveUser(ud)){
              return new ForwardResolution("/welcome.jsp");
            }else{
                return new ForwardResolution("/userdata.jsp"); 
            }
        }

     public Resolution testupdate() {
            dao=new UserDatadao();
            l=new ArrayList<UserData>();
            ud=new UserData(firstname,lastname);
            l.add(ud);
            System.out.println("inside update: "+ud);

            if( dao.getupdate(ud)){
              return new ForwardResolution("/testingGit.jsp");
            }else{
                return new ForwardResolution("/index.jsp");
            }
        }

    public Resolution delete() {
               dao=new UserDatadao();
               l=new ArrayList<UserData>();
               ud=new UserData(firstname,lastname);
               l.add(ud);
               System.out.println("inside update: "+ud);

               if( dao.getdelete(ud)){
                 return new ForwardResolution("/testingGit.jsp");
               }else{
                   return new ForwardResolution("/index.jsp");
               }
           }



}
        // LoginDao dao=new LoginDao();
              
        //loginList.add(dao.getUser());

        // if(dao.validateUser(username,password)){
        //return new ForwardResolution("/welcome.jsp");
        // }else{
        //     return new ForwardResolution("/login.jsp");
       //  }

   // }












