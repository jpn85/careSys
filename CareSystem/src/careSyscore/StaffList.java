/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

import person.Person;

/**
 *
 * @author Jack
 */
public class StaffList  {


        public DBCollection staffList;

    //constructor

    StaffList() throws UnknownHostException
    {
    	MongoClient mongo = new MongoClient( "localHost" , 27017 );    	
    	DB db = mongo.getDB("local"); 
    	DBCollection serviceUsers = db.getCollection("staffs");
    	
    	
    	
//    	Print out all users
//    	DBCursor cursor = serviceUsers.find();
//        try {
//           while(cursor.hasNext()) {
//               System.out.println(cursor.next());
//           }
//        } finally {
//           cursor.close();
//        }

    }
    


//    Collection<Person> getCareStaff()
//    {
//        return staffList;
//    }


    public DBCollection getStaffList() {
		return staffList;
	}



	public void setStaffList(DBCollection staffList) {
		this.staffList = staffList;
	}



	/**
     * Adds the ServiceUser
     */
    public void addCareStaff(Person aCareStaff)
    {
    	BasicDBObject document ;
        String address[];
        {
            document = new BasicDBObject();
            
            document.append("name", aCareStaff.getName());            

            document.append("sex", aCareStaff.getSex());            

            document.append("domesticCare", aCareStaff.getDomesticCare());            

            document.append("personalCare", aCareStaff.getPersonalCare());
             
            document.append("address", aCareStaff.getAddress());
            
            document.append("age", aCareStaff.getCurrentAgeToday());
            
            document.append("agePref", aCareStaff.getAgePref());
            
            document.append("phone", aCareStaff.getNumber());
            
            document.append("language", aCareStaff.getLanguages());
     
            staffList.insert(document);
     
        }
    }




    
    
    

}
