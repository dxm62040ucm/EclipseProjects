package com.reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebAddressValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result=isValidWebAddress("https://www.site123.org");
		System.out.println(result);
	}
	//It should start with either http or https
	//It should be followed by "://"
	//It may have "www."
	//The web address should be alphanumeric
	//After a "." the domain name should be one among "com","org","net"
	public static boolean isValidWebAddress(String webAddress)
	{
		boolean isValid=false;
		String regEx="^(http|https)://(www\\.)?[A-Za-z0-9]+\\.(com|org|net)$";

		//String[] in={"https://www.site123.org","http://mywebsite.net","ftp://example.com"};
		Pattern pattern=Pattern.compile(regEx);
		
		Matcher matcher=pattern.matcher(webAddress);
		
		if(matcher.matches())
		{
			isValid=true;
		}
			
		
		
		return isValid;
	}

}
