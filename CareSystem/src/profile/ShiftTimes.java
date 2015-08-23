package profile;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

import org.joda.time.LocalTime;

public class ShiftTimes 

{
	public Collection<LocalTime> shiftTimes;
	public LocalTime start;
	public LocalTime end;

	public ShiftTimes() 
	{
		shiftTimes = new HashSet<LocalTime>();
	}
	
	public void addStart(LocalTime aLocalTime) 
	{
		start = aLocalTime;
		shiftTimes.add(aLocalTime);
	}
	
	public void addEnd(LocalTime aLocalTime) 
	{
		end = aLocalTime;
		shiftTimes.add(aLocalTime);
	}

	@Override
	public String toString() 
	
	{
		
		
		return "ShiftTimes [start=" + start + ", end=" + end + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((end == null) ? 0 : end.hashCode());
		result = prime * result + ((start == null) ? 0 : start.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShiftTimes other = (ShiftTimes) obj;
		if (end == null) {
			if (other.end != null)
				return false;
		} else if (!end.equals(other.end))
			return false;
		if (start == null) {
			if (other.start != null)
				return false;
		} else if (!start.equals(other.start))
			return false;
		return true;
	}
	
	
	
		
	
	

}