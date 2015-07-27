/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package person;

/**
 *
 * @author Jack
 */
public class TelephoneNumber implements java.io.Serializable {
    /*
     * the telephone number
     */

    public int number;


    public void setNumber(int number)
    {
        this.number = number;
    }



    //constructor

    /*
     * initialises a new TelephoneNumber object
     * with the attribute number
     */


    public TelephoneNumber(int aNumber)
    {
        number = aNumber;
    }

    public int getNumber()
    {
        return number;
    }

    @Override
    public String toString()
    {
        return String.valueOf(number);
    }







}
