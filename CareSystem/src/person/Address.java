/*
 * a representation of a persons address
 */

package person;

import java.util.Objects;

/**
 *
 * @author Jack
 */
public class Address implements java.io.Serializable

{
//attributes
    private final String firstLine;

    private final String secondLine;

    private final String town;

    private final String postCode;

    //constructor

    public Address(String aFirstLine, String aSecondLine,String aTown, String aPostcode)
    {
        firstLine = aFirstLine;
        secondLine = aSecondLine;
        town = aTown;
        postCode = aPostcode;
    }
     /*
     * returns a String representation of the address object
     */

    @Override
     public String toString()
    {
         return firstLine + ", " + secondLine + ", " + town + ", " + postCode;
     }



    @Override
    public boolean equals(Object o)
    {

        if (!(o instanceof Address))
        {
            return false;
        }
        Address a = (Address) o;
        return (a.firstLine.equals(firstLine)) && 
                (a.secondLine.equals(secondLine)) && (a.town.equals(town)
                ) && (a.postCode.equals(postCode));
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.firstLine);
        hash = 59 * hash + Objects.hashCode(this.secondLine);
        hash = 59 * hash + Objects.hashCode(this.town);
        return hash;
    }

    /*
     * returns the firstLine
     */

    public String firstLine()

    {
        return firstLine;
    }

    /*
     * returns the secondLine
     */

    public String secondLine()

    {
        return secondLine;
    }
    /*
     * returns the town
     */

    public String town()

    {
        return town;
    }


    public String postCode()

    {
        return postCode;
    }

}
