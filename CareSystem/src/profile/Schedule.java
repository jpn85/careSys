package profile;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Schedule<Day, Hours> 
{
	public Hours theHours;
	public Day theDay;
	public Map <Day, Hours> theSched;
	
	
	public Schedule(Day aDay, Hours aHours) 
	{
		this.theDay = aDay;
		this.theHours = aHours;
//		theSched = new EnumMap<theDay, theHours>();

	}
	
	
	
	

}
