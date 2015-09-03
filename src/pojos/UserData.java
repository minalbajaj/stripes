package pojos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by IntelliJ IDEA.
 * User: u2
 * Date: Sep 28, 2011
 * Time: 12:53:01 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
public class UserData {
      @Id
      @GeneratedValue(strategy = GenerationType.AUTO)
      private int id;

    private String firstname;
    private String lastname;

    public UserData() {
        System.out.println("in userdata constructor");
    }

    public UserData(String firstname, String lastname) {
       
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
