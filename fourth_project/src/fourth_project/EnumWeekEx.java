package fourth_project;

import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		WeekKOR today=null;	
			
		//------------------	
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);	
			
		System.out.println("��:"+cal.get(Calendar.YEAR));	
		System.out.println("��:"+cal.get(Calendar.MONTH)+1); //���� 0���� �����ؼ� +1�� ������Ѵ�.	
		System.out.println("��:"+cal.get(Calendar.DAY_OF_WEEK));
			
		cal.set(Calendar.YEAR,2021);	
		cal.set(Calendar.MONTH,1-1);	
		cal.set(Calendar.DAY_OF_MONTH,24);
		week = cal.get(Calendar.DAY_OF_WEEK);		
			
		
		switch(week) {	
		case 1:	
			today = WeekKOR.�Ͽ���; break;	
		case 2:	
			today = WeekKOR.������; break;	
		case 3:	
			today = WeekKOR.ȭ����; break;
		case 4:	
			today = WeekKOR.������; break;	
		case 5:	
			today = WeekKOR.�����; break;	
		case 6:	
			today = WeekKOR.�ݿ���; break;	
		case 7:	
			today = WeekKOR.�����; break;
			
			
		}
		System.out.println("������ ����:"+today);
	}

}