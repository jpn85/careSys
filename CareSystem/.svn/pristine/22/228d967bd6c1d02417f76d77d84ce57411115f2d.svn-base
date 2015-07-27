/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package person;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/**
 *person object
 * @author Jack
 */
public class Person implements Serializable
{
//attributes
    /**
     * the name of the person
     */
    public Name name;

    /**
     * the date of birth of the person
     */
    public Address address;

    /**
     * the sex of the person
     */
    public Sex sex;

    /**
     * the date of birth of the person
     */
    public Date dob;

    /**
     * the telephone number of the person
     */
    public TelephoneNumber number;

     /**
     * the languages of the person
     */
     public Language languages;
//constructors
/**
 * initialises a new person object with the given attributes
 */
public Person (Name aName,Address anAddress, Sex aSex, Date aDob, TelephoneNumber aNumber, Language aLanguages)

    {
    name = aName;
    address = anAddress;
    sex = aSex;
    dob = aDob;
    number = aNumber;
    languages = aLanguages;
}

public long getCurrentAgeToday()
{
	Date today = new Date();
	
	Calendar x = Calendar.getInstance();
	
	x.set(dob.getYear(), dob.getMonth(), dob.getDay());
	
	Date myAge = x.getTime();
	
	Long theDifference  =today.getTime() - myAge.getTime();
	
	return (theDifference/1000)/60/60/24/365;
	
	
	
}

public Person getPerson()
    {
    return this;
}
    /**
     * Initialises a new Person object with the same attribute as the
     * Person object given as the argument.
     */
//    public Person(Person aPerson)
//    {
//        name = aPerson.getName();
//        address = aPerson.getAddress();
//        sex = aPerson.getSex();
//        dob = aPerson.getDob();
//        number = aPerson.getNumber();
//        languages = aPerson.getLanguages();
//    }
/**
 * initialises a new Person object with the given name
 * and all other parameters set to null
 * @param aName
 */
//    public Person(Name aName)
//    {
//                this(aName, null, null, null, null, null);
//    }
/**
 * initialises a new Person object with
 * all parameters set to null
 * @param aName
 */
    public Person()
    {
        this (null, null, null, null, null, null);
    }




    public Name getName()
    {
        return name;

    }

    public void setName(Name aName)
    {
        name = aName;

    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    public void setDob(Date dob)
    {
        this.dob = dob;
    }

    public void setLanguages(Language languages)
    {
        this.languages = languages;
    }

    public void setNumber(TelephoneNumber number)
    {
        this.number = number;
    }

    public void setSex(Sex sex)
    {
        this.sex = sex;
    }

    public Address getAddress()
    {
        return address;
    }
    public String getSex()
    {
        String x = sex.getSex();
        return x;
    }

    public Date getDob()
    {
        return dob;
    }
    public TelephoneNumber getNumber()
    {
        return number;
    }
    public Language getLanguages()
    {
            return languages;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name))
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ". Address:" + " " + address + ". Gender:" + " " + sex + ". Date of birth:" + " " + dob + ". Telephone number: "  + String.valueOf(number) +". " + languages + '}';
    }




}
