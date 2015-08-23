/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package careSyscore;

import person.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Jack
 */
public class Matching

{
	public Person theServiceUser;
	public Person theCareStaff;
	public int personalCareMatches;
	public int domesticCareMatches;
	public int languagesMatches;
	public StaffList theStaffList;

	public Matching(Person aServiceUser, StaffList aStaffList) {
		theServiceUser = aServiceUser;
		theStaffList = aStaffList;
		

		
		

		

	}

	public int matchPersonalCare(Person aServiceUser, Person aCareStaff) {
		theServiceUser = aServiceUser;
		theCareStaff = aCareStaff;

		PersonalCare userCare = theServiceUser.getPersonalCare();
		PersonalCare staffCare = theCareStaff.getPersonalCare();
		
		
		List<String> l1 = new ArrayList<String>(staffCare.getCare());
		List<String> l2 = new ArrayList<String>(userCare.getCare());

		Collection<String> similar = new HashSet<String>(l1);
		Collection<String> different = new HashSet<String>();
		different.addAll(l1);
		different.addAll(l2);

		similar.retainAll(l2);
		different.removeAll(similar);
		setPersonalCareMatches(similar.size());
		return similar.size();

	}

	public int getPersonalCareMatches() {
		return personalCareMatches;
	}

	public void setPersonalCareMatches(int personalCareMatches) {
		this.personalCareMatches = personalCareMatches;
	}

	public int matchDomesticCare(Person aServiceUser, Person aCareStaff) {
		theServiceUser = aServiceUser;
		theCareStaff = aCareStaff;

		DomesticCare userCare = theServiceUser.getDomesticCare();
		DomesticCare staffCare = theCareStaff.getDomesticCare();
		
		
		List<String> l1 = new ArrayList<String>(staffCare.getCare());
		List<String> l2 = new ArrayList<String>(userCare.getCare());

		Collection<String> similar = new HashSet<String>(l1);
		Collection<String> different = new HashSet<String>();
		different.addAll(l1);
		different.addAll(l2);

		similar.retainAll(l2);
		different.removeAll(similar);
		setDomesticCareMatches(similar.size());
		return similar.size();

	}

	public int getDomesticCareMatches() {
		return domesticCareMatches;
	}

	public void setDomesticCareMatches(int domesticCareMatches) {
		this.domesticCareMatches = domesticCareMatches;
	}

	public int matchLanguages(Person aServiceUser, Person aCareStaff) {
		theServiceUser = aServiceUser;
		theCareStaff = aCareStaff;
		
		Language userLang = theServiceUser.getLanguages();
		Language staffLang = theCareStaff.getLanguages();

		
		List<String> l1 = new ArrayList<String>(staffLang.getLanguages());		
		List<String> l2 = new ArrayList<String>(userLang.getLanguages());

		Collection<String> similar = new HashSet<String>(l1);
		Collection<String> different = new HashSet<String>();
		different.addAll(l1);
		different.addAll(l2);

		similar.retainAll(l2);
		different.removeAll(similar);

		System.out.println(similar.size());
		setLanguagesMatches(similar.size());
		return similar.size();
	}



	public boolean matchAge(Person aServiceUser, Person aCareStaff) {
		theServiceUser = aServiceUser;
		theCareStaff = aCareStaff;

		AgePref userAgePref = theServiceUser.getAgePref();
		int max = userAgePref.getMax();
		int min = userAgePref.getMin();

		long age = theCareStaff.getCurrentAgeToday();

		if (userAgePref == null || (age <= max && age >= min)) {
			return true;
		}

		return false;
	}

	public boolean matchSex(Person aServiceUser, Person aCareStaff) {
		theServiceUser = aServiceUser;
		theCareStaff = aCareStaff;

//		Profile userProfile = aServiceUser.getProfile();
		String userSexPref = theServiceUser.getSexPref().toString();

		String staffSex = theCareStaff.getSex();

		if (userSexPref == null || (userSexPref == staffSex)) {
			return true;
		}

		return false;
	}

	public Person getTheServiceUser() {
		return theServiceUser;
	}

	public void setTheServiceUser(Person theServiceUser) {
		this.theServiceUser = theServiceUser;
	}

	public Person getTheCareStaff() {
		return theCareStaff;
	}

	public void setTheCareStaff(Person theCareStaff) {
		this.theCareStaff = theCareStaff;
	}

	public int getLanguagesMatches() {
		return languagesMatches;
	}

	public void setLanguagesMatches(int languagesMatches) {
		this.languagesMatches = languagesMatches;
	}

	public StaffList getTheStaffList() {
		return theStaffList;
	}

	public void setTheStaffList(StaffList theStaffList) {
		this.theStaffList = theStaffList;
	}
	
	
	

}
