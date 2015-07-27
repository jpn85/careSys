/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;
import java.util.*;
import person.Person;

/**
 *List of Service Users
 * @author Jack
 */
public class UserList  {

    //attributes

/**
 * service users
 */

    public Collection<Person> serviceUsers;

    //constructor

    UserList()
    {
        serviceUsers = new ArrayList<Person>();

    }

     //package protocol

    /**
      * Returns all the ServiceUsers
      */
    Collection<Person> getServiceUsers()
    {
        return serviceUsers;
    }


    /**
     * Adds the ServiceUser
     */
    public void addServiceUser(Person aServiceUser)
    {
        serviceUsers.add(aServiceUser);
    }

    @Override
    public String toString()
    {
        return "UserList{" + "serviceUsers=" + serviceUsers + '}';
    }
//
//    @Override
//    public String toString()
//    {
//        Person thePerson = new Person();
//        StringBuilder result = null;
//        Iterator<Person> iterator = serviceUsers.iterator();
//
//        while (iterator.hasNext())
//        {
//            thePerson = iterator.next();
//            String personString = thePerson.toString();
//            result = result.append(personString).append("\r\n");
//            System.out.println(result);
//
//        }
//            return thePerson.toString();
//
//    }

    
    
}
