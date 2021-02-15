package com.cybage;

import java.util.*;
public class LastAndCurrentDate{
   public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
      //  cal.setTime(date);
	  System.out.println();
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());
		System.out.println();
		
		Calendar now = Calendar.getInstance();
		System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
		        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
		        + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
		        + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
			System.out.println();
    }
}