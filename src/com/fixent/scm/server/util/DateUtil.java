package com.fixent.scm.server.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	public static Date getLastDayOfTheMonth() {

		Date today = new Date();  

		Calendar calendar = Calendar.getInstance();  
		calendar.setTime(today);  

		calendar.add(Calendar.MONTH, 1);  
		calendar.set(Calendar.DAY_OF_MONTH, 1);  
		calendar.add(Calendar.DATE, -1);  

		Date lastDayOfMonth = calendar.getTime();  

		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
		
		return lastDayOfMonth;
	}

}
