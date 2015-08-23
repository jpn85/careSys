/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;
import java.net.UnknownHostException;
import java.util.*;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

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

    public DBCollection serviceUsers;

    //constructor

    UserList() throws UnknownHostException
    {
		MongoClient mongo = new MongoClient( "localHost" , 27017 );    	
    	DB db = mongo.getDB("local"); 
    	DBCollection aServiceUsers = db.getCollection("users");
    	serviceUsers = aServiceUsers;
    	
//    	System.out.println(serviceUsers.toString());
    	
//Print out all users
//    	DBCursor cursor = serviceUsers.find();
//        try {
//           while(cursor.hasNext()) {
//               System.out.println(cursor.next());
//           }
//        } finally {
//           cursor.close();
//        }

    }

     //package protocol

    /**
      * Returns all the ServiceUsers
      */


    /**
     * Adds the ServiceUser
     */
    public void addServiceUser(Person aServiceUser)
    {
    	
    	
    	
    	BasicDBObject document = new BasicDBObject();
        
            document.put("local", "users");
            document.append("name", aServiceUser.getName());            

            document.append("sex", aServiceUser.getSex());            

            document.append("domesticCare", aServiceUser.getDomesticCare());            

            document.append("personalCare", aServiceUser.getPersonalCare());
             
            document.append("address", aServiceUser.getAddress());
            
            document.append("age", aServiceUser.getCurrentAgeToday());
            
            document.append("agePref", aServiceUser.getAgePref());
            
            document.append("phone", aServiceUser.getNumber());
            
            document.append("language", aServiceUser.getLanguages());
     
//            serviceUsers.insert(document);
    
        
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

	public DBCollection getServiceUsers() {
		return serviceUsers;
	}

	public void setServiceUsers(DBCollection serviceUsers) {
		this.serviceUsers = serviceUsers;
	}

	public DBCursor find() {
		// TODO Auto-generated method stub
		return null;
	}

    
    
}
