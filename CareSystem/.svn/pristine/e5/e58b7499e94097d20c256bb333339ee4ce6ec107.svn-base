/*
 * A name object represents the name of a person
 */

package person;

import java.util.Objects;

/**
 *
 * @author Jack
 */
public class Name implements java.io.Serializable
{
        //attributes

    /*
     * the title of the person
     */
    public String title;

    /*
     * the first name of the person
     */
    public String firstName;

    /*
     * the surname of the person
     */

     public String surname;

            //constructor

     /*
      * intialises a new Name object with the attributes
      * title, firstName and surname
      */

    public Name(String title, String firstName, String surname)
    {
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
    }




    /*
     * returns a String representation of the Name object
     */
    
    @Override
    public String toString()
    {
        return title + " " + firstName + " " + surname;
    }

    /*
     * returns the title
     */

    public String getTitle()

    {
        return title;
    }

    /*
     * returns the firstName
     */

    public String getFirstName()

    {
        return firstName;
    }
    /*
     * returns the surname
     */

    public String getSurname()

    {
        return surname;
    }

    

    /*
     * compares two names for equality. Returns true if o is
     * an object with attributes equal to the receiver
     * otherwise returns false
     */
    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Name))
        {
            return false;
        }
        Name n = (Name) o;
        return (n.title.equals(title)) && (n.firstName.equals(firstName))
                && (n.surname.equals(surname));
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.title);
        hash = 53 * hash + Objects.hashCode(this.firstName);
        hash = 53 * hash + Objects.hashCode(this.surname);
        return hash;
    }
    /*
     * Compares Name objects alphabetically
     */

    public int compareTo(Name aName)
    {
        if (surname.compareTo(aName.surname) < 0)
            return -1;
        if (surname.compareTo(aName.surname) > 0)
            return 1;
        if  (firstName.compareTo(aName.firstName) < 0)
            return -1;
        if  (firstName.compareTo(aName.firstName) > 0)
            return 1;
        if  (title.compareTo(aName.title) < 0)
            return -1;
        if  (title.compareTo(aName.title) > 0)
            return 1;
        return 0;
    }
}
