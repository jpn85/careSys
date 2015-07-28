/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package profile;

import person.AgePref;
import person.CareTimes;
import person.DomesticCare;
import person.PersonalCare;
import person.SexPref;


/**
 *
 * @author Jack
 */
public class Profile
{
    public CareTimes careTimes;
    public Languages languagePref;
    public SexPref sexPref;
    public AgePref agePref;
    public PersonalCare personalCare;
    public DomesticCare domesticCare;

    public Profile(CareTimes careTimes, Languages languagePref,
            SexPref sexPref, AgePref agePref, PersonalCare personalCare,
            DomesticCare domesticCare)
    {
        this.careTimes = careTimes;
        this.languagePref = languagePref;
        this.sexPref = sexPref;
        this.agePref = agePref;
        this.personalCare = personalCare;
        this.domesticCare = domesticCare;
    }

    public AgePref getAgePref()
    {
        return agePref;
    }

    public void setAgePref(AgePref agePref)
    {
        this.agePref = agePref;
    }

    public CareTimes getCareTimes()
    {
        return careTimes;
    }

    public void setCareTimes(CareTimes careTimes)
    {
        this.careTimes = careTimes;
    }

    public DomesticCare getDomesticCare()
    {
        return domesticCare;
    }

    public void setDomesticCare(DomesticCare domesticCare)
    {
        this.domesticCare = domesticCare;
    }

    public Languages getLanguagePref()
    {
        return languagePref;
    }

    public void setLanguagePref(Languages languagePref)
    {
        this.languagePref = languagePref;
    }

    public PersonalCare getPersonalCare()
    {
        return personalCare;
    }

    public void setPersonalCare(PersonalCare personalCare)
    {
        this.personalCare = personalCare;
    }

    public String getSexPref()
    {
        String x = sexPref.getSexPref();
    	return x;
    }

    public void setSexPref(SexPref sexPref)
    {
        this.sexPref = sexPref;
    }


}
