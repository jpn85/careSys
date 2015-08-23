/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;

import java.sql.Time;

import person.Hours;
import person.Person;
import profile.Profile;

/**
 *
 * @author Jack
 */
public class CareStaff extends Person
{
    public Person person;
    public Hours workingHours;


    public CareStaff(Person person, Hours aWorkingHours)
    {
        this.person = person;
        workingHours = aWorkingHours;
    }


	public Person getPerson() {
		return person;
	}


	public void setPerson(Person person) {
		this.person = person;
	}


	public Hours getWorkingHours() {
		return workingHours;
	}


	public void setWorkingHours(Hours workingHours) {
		this.workingHours = workingHours;
	}

  
    

}
