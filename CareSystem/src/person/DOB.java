/*
 * represents the date of birth of the person
 */
package person;

import java.util.Date;
/**
 *
 * @author Jack
 */
public class DOB implements java.io.Serializable
{
    /*
     * the day of the date
     */
   public int day;
     /*
     * the month of the date
     */
   public int month;
    /*
     * the year of the date
     */
   public int year;


      //constructor
/*
 * initilses a new DOB object with the attributes
 * day, month, year
 */

   
   
   public DOB(int aDay, int aMonth, int aYear)
   {
      day= aDay;
      month = aMonth;
      year = aYear;
   }
   
   

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }
   
   

   public void setDay(int day) {
	this.day = day;
}


public void setMonth(int month) {
	this.month = month;
}


public void setYear(int year) {
	this.year = year;
}


@Override
   public String toString()
   {
      return day + "/" + month + "/" + year;
   }


}

