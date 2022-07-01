package jdbc_mainjava;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class PrintUtil {
	
	public static void print_list(ArrayList<StudentsVO> list) {	
		String std_gender ="";
		String std_duty ="";
		System.out.println("������ | ���� | �̸� | ���� | �޴��� | ������� |�����");
		for(StudentsVO studentsVO : list) {	
			if(studentsVO.getD_name()==null) {	
				std_duty="���л�";
			} else {	
				std_duty = studentsVO.getD_name();
			}
			if(studentsVO.getS_gender().equals("1")) {	
				std_gender="����";
			} else {	
				std_gender = "����";
			}
			System.out.println(studentsVO.getS_idx()+"|"+
					std_gender+"|"+studentsVO.getS_name()+"|"+
					std_duty+"|"+studentsVO.getS_phone()+"|"+
					studentsVO.getS_birth()+"|"+
					studentsVO.getS_rgstdate());
		}
		
	}
	
	public static void print_view(StudentsVO studentsVO) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy��MM��dd��");
		System.out.println("===========================");
		System.out.println("������:"+studentsVO.getS_idx());
		System.out.println("�̸�:"+studentsVO.getS_name());
		System.out.println("�ڵ���:"+studentsVO.getS_phone());
		System.out.println("�������:"+studentsVO.getS_birth());
		if(studentsVO.getS_gender().equals("1")) {	
			System.out.println("����:����");
		} else {	
			System.out.println("����:����");
		}
		if(studentsVO.getD_name()==null) {	
			System.out.println("����:���л�");
		} else {	
			System.out.println("����:"+studentsVO.getD_name());	
		}
		
		if(studentsVO.getS_mdfydate()==null) {	
			System.out.println("�����Ͼ���");
		} else {	
			System.out.println("������:"+format.format(studentsVO.getS_mdfydate()));
		}
		
		System.out.println("�����:"+format.format(studentsVO.getS_rgstdate()));
		System.out.println("===========================");
	}

	public static void classprint_view(StudentsVO studentsVO) {
		// TODO Auto-generated method stub
		
	}

	public static void print_view(StudentsDAO stDAO) {
		// TODO Auto-generated method stub
		
	}

	public static void print_view(int s_idx) {
		// TODO Auto-generated method stub
		
	}
	
	
}
