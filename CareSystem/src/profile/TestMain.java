package profile;

import java.net.UnknownHostException;
import java.time.LocalDate;
import java.util.Calendar;

import org.bson.types.ObjectId;
import org.joda.time.Instant;
import org.joda.time.JodaTimePermission;
import org.joda.time.LocalTime;

import person.Name;

import com.mongodb.BasicDBObjectBuilder;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

import java.util.Date;

public class TestMain {

	public static void main(String[] args) throws UnknownHostException {
		

		MongoClient mongo = new MongoClient( "localHost" , 27017 );
		
		DB db = mongo.getDB("local");
		DBCollection userColl = db.getCollection("users");
		
		BasicDBObject searchQuery1 = new BasicDBObject();
		searchQuery1.put("index", 0);
	 
		DBCursor cursor = userColl.find(searchQuery1); 
	 
			System.out.println(cursor.next());
			
			
//			Object t = searchQuery1.get("name");
			
//			System.out.println(t);
//		
//			DBObject doc = userColl.findAndModif);
//			System.out.println(doc);
			
			
			final ObjectId docId = ObjectId.get();
			final DBObject doc = BasicDBObjectBuilder.start().add("_id", docId).add("foo", "bar").get();
			mongo.getDB("mongo-java-driver-intro").getCollection("updateExamples").insert(doc);
		
		
		

	}
	
}
	
	
	
	

