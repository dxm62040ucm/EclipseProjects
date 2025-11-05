package com.localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BasicMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		//of() returns the instance of the local date
		LocalDate localDate1=LocalDate.of(1993,03,02);
		System.out.println(localDate1);
		
		//ofPattern creates a formatter specified pattern
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(dateTimeFormatter.format(localDate1));
	}

}
