package profile;

import java.util.EnumMap;
import java.util.Map;

public enum  Day 
{
    SUNDAY (0),
    MONDAY (1),
    TUESDAY (2),
    WEDNESDAY (3),
    THURSDAY (4),
    FRIDAY (5),
    SATURDAY (6);
    
//    Map<Day, Hours> enumMap = new EnumMap<Day, Hours>(null);
//    enumMap.put(Day.SUNDAY);
    
    private int value;
    
	private Day(int value) 
	{
	    this.setValue(value);
	}

	public int getValue() 
	{
		return value;
	}

	public void setValue(int aValue) 
	{
		this.value = aValue;
	}





}
