

package careSyscore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import person.Address;
import person.AgePref;
import person.CareTimes;
import person.DOB;
import person.DomesticCare;
import person.Name;
import person.PersonalCare;
import person.Sex;
import person.Language;
import person.Person;
import person.Sex;
import person.SexPref;
import person.TelephoneNumber;
import profile.Languages;
import profile.Profile;


/**
 *
 * @author Jack
 */
public class SysCoord {

      UserList aUserList = new UserList();
      StaffList aStafflist = new StaffList();
//      Collection<Person> aStafflist = (Collection<Person>) new StaffList();

      public static void main(String[] args) throws IOException
    {
          SysCoord theSysCoord = new SysCoord();
          theSysCoord.load();
    }
public void load() throws IOException
    {
	
	MongoClient mongo = new MongoClient( "localHost" , 27017 );
	
	DB db = mongo.getDB("local");
	DBCollection collection = db.getCollection("userCollection");
	
	
//	
//	CareTimes careTimes = null;
//	Name aName = new Name("Mr", "John", "Smith");
//	Address anAddress = new Address("1 the street", "townton", "London", "N1 1KL");
//	Sex aSex = new Sex("Male");
//    DOB aDob = new DOB (03, 1, 85);
//	TelephoneNumber aNumber = new TelephoneNumber (68115);
//	Languages languagePref1 = new Languages("English");
//    SexPref sexPref = new SexPref("Male");
//    AgePref agePref = new AgePref(18, 100);
//    PersonalCare personalCare1 = new PersonalCare("washing");
//    personalCare1.addCareType("cleaning");
//    DomesticCare domesticCare = null;
//    
//	
//	
//	ServiceUser aServiceUser = new ServiceUser();
//	
//	BasicDBObject document = new BasicDBObject();
//	document.put("aServiceUser", aServiceUser);
//	collection.insert(document);
	
	
	
	
	
	
	
	
	
	System.out.println("All Persons: "+collection.getCount());
	
	    }
	
	
    
	
	
	
	
	
	
	
	
	


//	CareTimes careTimes = null;
//	Languages languagePref1 = new Languages("English");
//	Languages languagePref2 = new Languages("Spanish");
//    SexPref sexPref = null;
//    AgePref agePref = null;
//    PersonalCare personalCare1 = new PersonalCare("1");
//    PersonalCare personalCare2 = new PersonalCare("1");
//    DomesticCare domesticCare = null;
//    
//	Profile aCarePlan1 = new Profile(careTimes, languagePref1,
//            sexPref, agePref, personalCare1,
//            domesticCare);
//	
//	
//	ServiceUser aServiceUser = new ServiceUser(null, aCarePlan1);
//	
//	Profile aCarePlan2 = new Profile(careTimes, languagePref2, sexPref, agePref, personalCare2, domesticCare);
//	
//	Person aCareStaff = new CareStaff(null, aCarePlan2);
//	StaffList aStafflist = new StaffList();
//	aStafflist.addCareStaff(aCareStaff);
//	CareStaff aCareStaff2 = new CareStaff(null, aCarePlan2);
//	aStafflist.addCareStaff(aCareStaff2);
//	
//	
//	languagePref2.addLanguages("English");
//	
//	Matching match = new Matching(aServiceUser, aStafflist);
//	
//	
//  StringBuilder result = null;
//  Iterator<Person> iterator = ((Collection<Person>) aStafflist).iterator();
//
//  while (iterator.hasNext())
//  {
//      aCareStaff = iterator.next();
//      String personString = aCareStaff.toString();
//      result = result.append(personString).append("\r\n");
//      System.out.println(result);
//
//  }
	
    
//	System.out.println(aStafflist.toString());

      
//    }

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

//    Person aPerson1 = new Person(name1, address1, sex1, dob1, tel1, languages1, null, null, null);
    
    UserList newList = new UserList();
//    newList.addServiceUser(aPerson1);

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

//    Person aPerson2 = new Person(name2, address2, sex2, dob2, tel2, languages2, null, null, null);


//    newList.addServiceUser(aPerson2);

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
