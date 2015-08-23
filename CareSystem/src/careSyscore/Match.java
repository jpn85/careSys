package careSyscore;

import java.io.Serializable;
import java.util.Date;

import profile.CareTimes;
import profile.ShiftTimes;

public class Match implements Serializable{
	
	public Date adate;
	public CareTimes aCaretimes;
	public ShiftTimes ashifttimes;
	public ServiceUser aServiceUser;
	public CareStaff aCareStaff;

}
