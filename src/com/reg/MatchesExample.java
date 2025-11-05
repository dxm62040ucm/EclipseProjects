package com.reg;

import java.util.regex.*;

public class MatchesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regEx1 = "^[A-Z].*$";
		String regEx2=".*to.*";
		// Checks weather the given string starts with upper case or not

		String[] input = { "niha", "Nikki" };
        String input1="Tommorow";
		Pattern pattern = Pattern.compile(regEx1);

		for (String s : input) {
			Matcher matcher = pattern.matcher(s);
			if (matcher.matches()) {
				System.out.println("The given string starts with Uppercase : " + s);
			} else {
				System.out.println("The given string not starts with Uppercase : " + s);
			}

		}

		// check weather the string contains specific string or not
		
		Pattern pattern1=Pattern.compile(regEx2);
		Matcher matcher1=pattern1.matcher(input1);
		if(matcher1.matches()) {
			System.out.println("The given string contains the substring: "+matcher1.group());
		}
		else {
			System.out.println("The given string does not contain the substring");
		}
		//first character should be upper case and atleast one letter in lowercase and with any 2 or more digit number
		String regEx3="[A-Z](?=.*[a-z]).*[0-9]{2}";
		String[] string= {"Asd23","Ds3","Sda23","Fs222"};
		Pattern pattern2=Pattern.compile(regEx3);
		for(String str:string) {
		Matcher matcher2=pattern2.matcher(str);
		if(matcher2.matches()) {
			System.out.println("The given string follows the Pattern: "+str);
			
		}
		else {
			System.out.println("The given string does not follows the Pattern: "+str);
		}
		}
		

	}

}
