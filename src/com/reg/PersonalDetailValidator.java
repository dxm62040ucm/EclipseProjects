package com.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonalDetailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// personal Details
		String name = "java practice";
		String emailId = "dakshyani.maddikunta@gmail.co";
		String userId = "dak#29Mad";
		String accessorSerialId = "WOW-AbcDefG12345AbcDefG_X9aT3";
		// name checking
		String nameRegEx1 = "^[A-Za-z\s]+$";

		Pattern pattern1 = Pattern.compile(nameRegEx1);

		Matcher matcher1 = pattern1.matcher(name);

		if (matcher1.matches()) {
			System.out.println(name + " is Matched with given pattern: ");
		} else {
			System.out.println(name + " is not Matched with given pattern: " + name);
		}

		// EmailId checking
		String nameRegEx2 = "^[A-Za-z]+\\.[A-Za-z]+@[A-Za-z]+\\.(com|in)$";

		Pattern pattern2 = Pattern.compile(nameRegEx2);

		Matcher matcher2 = pattern2.matcher(emailId);

		if (matcher2.matches()) {
			System.out.println(emailId + " is Matched with given pattern: ");
		} else {
			System.out.println(emailId + " is not Matched with given pattern: " );
		}
		
		//UserId Checking
		//<firstname>#<any 2 digits><lastname>
		String nameRegEx3 = "^[A-Za-z]+#[0-9]{2}[A-Za-z]+$";

		Pattern pattern3 = Pattern.compile(nameRegEx3);

		Matcher matcher3 = pattern3.matcher(userId);
		if (matcher3.matches()) {
			System.out.println(userId + " is Matched with given pattern: ");
		} else {
			System.out.println(userId + " is not Matched with given pattern: " );
		}
		
		//AccountSerial Id checking
		//WOW-<any 7 alphabatic cide><any 5 digits><Same 7 Alphaphabatic code>_<any 5 alphanumeric code>
		String nameRegEx4 = "^WOW-([A-Za-z]{7})([0-9]{5})\\1_[A-Za-z0-9]{5}$";

		Pattern pattern4 = Pattern.compile(nameRegEx4);

		Matcher matcher4 = pattern4.matcher(accessorSerialId);
		if (matcher4.matches()) {
			System.out.println(accessorSerialId + " is Matched with given pattern: ");
		} else {
			System.out.println(accessorSerialId + " is not Matched with given pattern: " );
		}
		
	}

}
