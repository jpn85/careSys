/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;

import java.sql.Time;

import person.Person;
import profile.Profile;

/**
 *
 * @author Jack
 */
public class CareStaff extends Person
{
    public Person person;
    public Time workingHours;
    public Profile profile;


    public CareStaff(Person person, Profile aProfile)
    {
        this.person = person;
        profile = aProfile;
    }

    Profile getProfile()
    {
        return profile;
    }
    

}
