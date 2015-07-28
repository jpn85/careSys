package person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CareType {

    public List<String> careCollection;
    public String careType;
    
       

	public CareType(String aCareType) 
	{
		careCollection  = new ArrayList<String>();
		careCollection.add(aCareType);
	}

	public void addCareType(String aCareType)
	{
		Collection<String> aCareCollection = getCare();
		aCareCollection.add(aCareType);
		
	}


	public Collection<String> getCare() {
		return careCollection;
	}



	public void setCare(List<String> care) {
		this.careCollection = care;
	}

	@Override
	public String toString() {
		return "CareType [careCollection=" + careCollection + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((careType == null) ? 0 : careType.hashCode());
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
		CareType other = (CareType) obj;
		if (careType == null) {
			if (other.careType != null)
				return false;
		} else if (!careType.equals(other.careType))
			return false;
		return true;
	}
	
	
	

	
	
}
