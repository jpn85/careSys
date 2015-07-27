/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import person.Address;
import person.DOB;
import person.Name;
import person.Sex;
import person.Language;
import person.Person;
import person.Sex;
import person.TelephoneNumber;
import profile.AgePref;
import profile.CareTimes;
import profile.DomesticCare;
import profile.Languages;
import profile.PersonalCare;
import profile.Profile;
import profile.SexPref;


/**
 *
 * @author Jack
 */
public class SysCoord {

      UserList aUserList = new UserList();
      StaffList aStafflist = new StaffList();

      public static void main(String[] args) throws IOException
    {
          SysCoord theSysCoord = new SysCoord();
          theSysCoord.load();
    }
public void load() throws IOException
    {

	CareTimes careTimes = null;
	Languages languagePref1 = new Languages("English");
	Languages languagePref2 = new Languages("Spanish");
    SexPref sexPref = null;
    AgePref agePref = null;
    PersonalCare personalCare1 = new PersonalCare("1");
    PersonalCare personalCare2 = new PersonalCare("1");
    DomesticCare domesticCare = null;
    
	Profile aCarePlan1 = new Profile(careTimes, languagePref1,
            sexPref, agePref, personalCare1,
            domesticCare);
	
	
	ServiceUser aServiceUser = new ServiceUser(null, aCarePlan1);
	
	Profile aCarePlan2 = new Profile(careTimes, languagePref2, sexPref, agePref, personalCare2, domesticCare);
	
	CareStaff aCareStaff = new CareStaff(null, aCarePlan2);
	
	
	
	languagePref2.addLanguages("English");
	
	Matching match = new Matching(aServiceUser, aStafflist);
    


      
    }

public void newPerson()
{
    String title1 = "mr";
    String first1 = "first1";
    String surname1 = "surname1";
    Name name1 = new Name (title1, first1, surname1);

    String firstLine1 = "firstLine1";
    String secondLine1 = "secondLine1";
    String town1 = "town1";
    String postcode1 = "postcode1";
    Address address1 = new Address (firstLine1, secondLine1, town1, postcode1);
    

    String m = "male";
    Sex sex1 = new Sex(m);


    int day1 = 1;
    int month1= 9;
    int year1 = 87;
    Date dob1 = new Date (day1, month1, year1);

    
    TelephoneNumber tel1 = new TelephoneNumber(115);

    String lang = "english";
    Language languages1 = new Language(lang);

    Person aPerson1 = new Person(name1, address1, sex1, dob1, tel1, languages1);
    
    UserList newList = new UserList();
    newList.addServiceUser(aPerson1);

    String title2 = "mr";
    String first2 = "first2";
    String surname2 = "surname2";
    Name name2 = new Name (title2, first2, surname2);

    String firstLine2 = "firstLine2";
    String secondLine2 = "secondLine2";
    String town2 = "town2";
    String postcode2 = "postcode2";
    Address address2 = new Address (firstLine2, secondLine2, town2, postcode2);


    String m2= "male";
    Sex sex2 = new Sex(m);


    int day2 = 1;
    int month2= 9;
    int year2 = 87;
    Date dob2 = new Date (day2, month2, year2);


    TelephoneNumber tel2= new TelephoneNumber(115);

    String lang2 ="english";
    Language languages2 = new Language(lang);

    Person aPerson2 = new Person(name2, address2, sex2, dob2, tel2, languages2);


    newList.addServiceUser(aPerson2);

System.out.println(newList);




}




   /**
    * returns list of service users
    */
    public Collection<Person> getServiceUsers(UserList aUserList)
    {
        return aUserList.getServiceUsers();
    }

    /**
     * records addition of service user to the list
     * with the given attributes
     */

}
