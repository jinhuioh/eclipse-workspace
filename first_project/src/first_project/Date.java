package first_project;

import java.time.LocalDate;

public class Date {

	public static void main(String[] args) {
		
		
		LocalDate localdate=LocalDate.now();
		System.out.println("��:"+localdate.getYear());	
		System.out.println("��:"+localdate.getMonth());	
		System.out.println("��:"+localdate.getMonthValue());	
		System.out.println("��:"+localdate.getDayOfWeek());
		
	
//	localdate localdate2=LocalDate.of(2022,1,24);
//	System.out.println("����:"+localdate2.getDayOftWeek());	
	}

}
