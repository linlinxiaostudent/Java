package day0313;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		//当前时间
		Date date = new Date();
		System.out.println(date);
		//从1970-01-01 00：00：00走过参数的时间
		Date date1 = new Date(1000);
		System.out.println(date1);
		DateFormat format = new SimpleDateFormat("YYY-MM-dd HH:mm:ss");
		String t = format.format(date);
		System.out.println(t);
		date.setTime(5000);//设置时间
		System.out.println(date);
		System.out.println(date.getTime());
		//返回从从1970-01-01 00：00：00走过参数的毫秒数
	}
}
