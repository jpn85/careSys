///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package careSyscore;
//
//import person.*;
//import profile.*;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//
///**
// *
// * @author Jack
// */
//public class Matching
//
//{
//	public ServiceUser theServiceUser;
//	public Person theCareStaff;
//	public int personalCareMatches;
//	public int domesticCareMatches;
//	public int languagesMatches;
//	public StaffList theStaffList;
//
//	public Matching(ServiceUser aServiceUser, StaffList aStaffList) {
//		theServiceUser = aServiceUser;
//		theStaffList = aStaffList;
//		
////		for (Person aPerson : theStaffList)
////			
////		{
////			System.out.println(theCareStaff);
////		}
//		
//		
////      StringBuilder result = null;
////      Iterator<Person> iterator = theStaffList.iterator();
////
////      while (iterator.hasNext())
////      {
////          theCareStaff = iterator.next();
////          String personString = theCareStaff.toString();
////          result = result.append(personString).append("\r\n");
////          System.out.println(result);
////
////      }
//		
//
//	}
//
//	public int matchPersonalCare(ServiceUser aServiceUser, CareStaff aCareStaff) {
//		theServiceUser = aServiceUser;
//		theCareStaff = aCareStaff;
//
//		Profile staffProfile = aCareStaff.getProfile();
//		PersonalCare staffCare = staffProfile.getPersonalCare();
//		List<String> l1 = new ArrayList<String>(staffCare.getCare());
//
//		Profile userProfile = aServiceUser.getProfile();
//		PersonalCare userCare = userProfile.getPersonalCare();
//		List<String> l2 = new ArrayList<String>(userCare.getCare());
//
//		Collection<String> similar = new HashSet<String>(l1);
//		Collection<String> different = new HashSet<String>();
//		different.addAll(l1);
//		different.addAll(l2);
//
//		similar.retainAll(l2);
//		different.removeAll(similar);
//		setPersonalCareMatches(similar.size());
//		return similar.size();
//
//	}
//
//	public int getPersonalCareMatches() {
//		return personalCareMatches;
//	}
//
//	public void setPersonalCareMatches(int personalCareMatches) {
//		this.personalCareMatches = personalCareMatches;
//	}
//
//	public int matchDomesticCare(ServiceUser aServiceUser, CareStaff aCareStaff) {
//		theServiceUser = aServiceUser;
//		theCareStaff = aCareStaff;
//
//		Profile staffProfile = aCareStaff.getProfile();
//		DomesticCare staffCare = staffProfile.getDomesticCare();
//		List<String> l1 = new ArrayList<String>(staffCare.getCare());
//
//		Profile userProfile = aServiceUser.getProfile();
//		DomesticCare userCare = userProfile.getDomesticCare();
//		List<String> l2 = new ArrayList<String>(userCare.getCare());
//
//		Collection<String> similar = new HashSet<String>(l1);
//		Collection<String> different = new HashSet<String>();
//		different.addAll(l1);
//		different.addAll(l2);
//
//		similar.retainAll(l2);
//		different.removeAll(similar);
//
//		setDomesticCareMatches(similar.size());
//		return similar.size();
//
//	}
//
//	public int getDomesticCareMatches() {
//		return domesticCareMatches;
//	}
//
//	public void setDomesticCareMatches(int domesticCareMatches) {
//		this.domesticCareMatches = domesticCareMatches;
//	}
//
//	public int matchLanguages(ServiceUser aServiceUser, CareStaff aCareStaff) {
//		theServiceUser = aServiceUser;
//		theCareStaff = aCareStaff;
//
//		Profile staffProfile = aCareStaff.getProfile();
//		Languages staffLang = staffProfile.getLanguagePref();
//		List<String> l1 = new ArrayList<String>(staffLang.getLanguages());
//
//		Profile userProfile = aServiceUser.getProfile();
//		Languages userLang = userProfile.getLanguagePref();
//		List<String> l2 = new ArrayList<String>(userLang.getLanguages());
//
//		Collection<String> similar = new HashSet<String>(l1);
//		Collection<String> different = new HashSet<String>();
//		different.addAll(l1);
//		different.addAll(l2);
//
//		similar.retainAll(l2);
//		different.removeAll(similar);
//
//		System.out.println(similar.size());
//		setlanguagesMatches(similar.size());
//		return similar.size();
//	}
//
//	private void setlanguagesMatches(int size) {
//		// TODO Auto-generated method stub
//		this.languagesMatches = size;
//	}
//
//	public boolean matchAge(ServiceUser aServiceUser, CareStaff aCareStaff) {
//		theServiceUser = aServiceUser;
//		theCareStaff = aCareStaff;
//
//		Profile userProfile = aServiceUser.getProfile();
//		AgePref userAgePref = userProfile.getAgePref();
//		int max = userAgePref.getMax();
//		int min = userAgePref.getMin();
//
//		long age = theServiceUser.getCurrentAgeToday();
//
//		if (userAgePref == null || (age <= max && age >= min)) {
//			return true;
//		}
//
//		return false;
//	}
//
//	public boolean matchSex(ServiceUser aServiceUser, CareStaff aCareStaff) {
//		theServiceUser = aServiceUser;
//		theCareStaff = aCareStaff;
//
//		Profile userProfile = aServiceUser.getProfile();
//		String userSexPref = userProfile.getSexPref();
//
//		String staffSex = theCareStaff.getSex();
//
//		if (userSexPref == null || (userSexPref == staffSex)) {
//			return true;
//		}
//
//		return false;
//	}
//
//}
