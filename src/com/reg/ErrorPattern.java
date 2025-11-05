package com.reg;

import java.util.regex.*;

public class ErrorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String errorPattern = "\\bError\\s+\\d+\\b";
		String errorLogs = "System log: Error 404 occured at the line 23";
		Pattern pattern = Pattern.compile(errorPattern);
		
			Matcher matcher = pattern.matcher(errorLogs);
			if (matcher.find()) {
				System.out.println("info: " + matcher.group());
			} else {
				System.out.println("No Errors");
			}
		
	}
}
