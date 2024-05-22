package wret;

import java.text.*;
import java.util.*;

public class simpleDataFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		
		SimpleDateFormat sdf1=
				new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		System.out.println(sdf1.format(d));
		
		SimpleDateFormat sdf2= new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			d=sdf2.parse("2023-02-28");
		}catch (parseException e) {
		}
		System.out.println(sdf1.format(d));
		
		Calendar calendar=Calendar.getInstance();
		SimpleDateFormat sdf3=
				new SimpleDateFormat("E yyyy.MM.dd",Locale.US);
		System.out.println(sdf3.format(calendar.getTime()));
		
		SimpleDateFormat sdf4=
				new SimpleDateFormat("E yyyy.MM.dd",Locale.KOREA);
		System.out.println(sdf4.format(calendar.getTime()));
				
	}

}
