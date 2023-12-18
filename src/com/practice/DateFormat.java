package com.practice;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date= new Date();
		
		System.out.println(sdf.format(date));
				

	}

}
