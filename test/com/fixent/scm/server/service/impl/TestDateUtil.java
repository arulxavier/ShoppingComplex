package com.fixent.scm.server.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDateUtil {
	
	public static void main(String[] args) {
		
//		Calendar calendar = Calendar.getInstance();
//		Date date = calendar.getTime();
//		System.out.println(date);
		
		 

        Date today = new Date();  

        Calendar calendar = Calendar.getInstance();  
        calendar.setTime(today);  

        calendar.add(Calendar.MONTH, 1);  
        calendar.set(Calendar.DAY_OF_MONTH, 1);  
        calendar.add(Calendar.DATE, -1);  

        Date firstDayOfMonth = calendar.getTime();  

        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        System.out.println("Today            : " + sdf.format(today));  
        System.out.println("Last Day of Month: " + sdf.format(firstDayOfMonth));
        
        System.out.println("Today            : " + today);  
        System.out.println("Last Day of Month: " + firstDayOfMonth);
		
	}

}
