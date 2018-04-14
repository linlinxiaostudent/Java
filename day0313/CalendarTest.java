package day0313;

import java.util.Calendar;
import java.util.Date; 

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR ));
		System.out.println(c.get(Calendar.MONTH  ));
		System.out.println(c.get(Calendar.DATE  ));
		System.out.println(c.get(Calendar.HOUR ));
		System.out.println(c.get(Calendar.HOUR_OF_DAY  ));
		System.out.println(c.get(Calendar.MINUTE ));
		System.out.println(c.get(Calendar.SECOND ));
		c.set(Calendar.YEAR , 2019);//设置指定的字段
		System.out.println(c.get(Calendar.YEAR ));
		c.set(2016, 06, 8);//设置年月日
		
		Date d = c.getTime();
		System.out.println(d);
		
		
	}

}
