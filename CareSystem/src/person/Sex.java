/*
 * represents male and female sexes
 */

package person;

/**
 *
 * @author Jack
 */
public class Sex implements java.io.Serializable


{

    public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	String sex;

    public Sex(String sex)
    {
        this.sex = sex;
    }

    @Override
    public String toString()
    {
        return sex;
    }

    


//
//
//    /**
//     * Represents female.
//     */
//    F,
//    /**
//     * Represents male.
//     */
//    M;
//
//    public static Sex getF()
//    {
//        return F;
//    }
//
//    public static Sex getM()
//    {
//        return M;
//    }
//
//
//    //public protocol
//
//    /**
//     * Returns a string of the sex either male or female
//     */
//    @Override
//    public String toString()
//    {
//        switch (this)
//        {
//            case F: return "female";
//            default: return "male";
//        }
//    }
}
