/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;

import java.util.Collection;
import java.util.HashSet;
import person.Person;

/**
 *
 * @author Jack
 */
public class StaffList {


        public Collection<Person> staffList;

    //constructor

    StaffList()
    {
        staffList = new HashSet<Person>();
        //4

    }


    Collection<Person> getCareStaff()
    {
        return staffList;
    }


    /**
     * Adds the ServiceUser
     */
    public void addCareStaff(Person aCareStaff)
    {
        staffList.add(aCareStaff);
    }

    @Override
    public String toString()
    {
        return "Staff List: " + staffList;
    }

}
