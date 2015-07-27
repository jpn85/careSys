/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package profile;

/**
 *
 * @author Jack
 */
public class AgePref
{
    public int min;
    public int max;

    public AgePref(int min, int max)
    {
        this.min = min;
        this.max = max;
    }

    public int getMax()
    {
        return max;
    }

    public void setMax(int max)
    {
        this.max = max;
    }

    public int getMin()
    {
        return min;
    }

    public void setMin(int min)
    {
        this.min = min;
    }


}
