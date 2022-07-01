package jdbc_mainjava; //crud�� �̿��� �Խ��� �����.

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class JDBC_Main {
	
	public static void main(String[] args) {	
		Database db = new Database();	
		Connection con =db.getConnection();	
			
		StudentsDAO stDAO = new StudentsDAO(con);
		
		Scanner scanner=new Scanner(System.in);
		while(true) {	
			System.out.println("ȸ��(1:���,2:����,3:��,4:����,5:���,q:������:");
			String ch_num = scanner.nextLine();
			
			if(ch_num.equals("q")) {	//���α׷�������
				System.out.println("�ȳ��ϰ輼��~");
				break;
			
			} else if (ch_num.equals("5")) {	
				
				PrintUtil.print_list(stDAO.list());
			
			} else if (ch_num.equals("1")) {	//ȸ������ ���
	
				StudentsVO studentsVO = new StudentsVO();
				System.out.print("�л��̸�:");
				studentsVO.setS_name(scanner.nextLine());
				System.out.print("����(1:����, 2:����):");	
				studentsVO.setS_gender(scanner.nextLine());
				System.out.print("phone:");	
				studentsVO.setS_phone(scanner.nextLine());
				System.out.print("birth:");	
				studentsVO.setS_birth(scanner.nextLine());
				//ȸ������ db���
				stDAO.insert(studentsVO);
				//ȸ����� ��������.
				PrintUtil.print_list(stDAO.list());
			
			} else if (ch_num.equals("3")) {	//ȸ��������
				System.out.print("�л�������:");
				PrintUtil.print_view(
						stDAO.view(Integer.parseInt(scanner.nextLine()))
						);
			} else if (ch_num.equals("2")) { //ȸ����������
				StudentsVO studentsVO = new StudentsVO();
				System.out.print("�л�������:");
				studentsVO.setS_idx(Integer.parseInt(scanner.nextLine()));
				
				System.out.print("�л��̸�:");
				studentsVO.setS_name(scanner.nextLine());
				
				System.out.print("�ڵ���:");
				studentsVO.setS_phone(scanner.nextLine());
				
				System.out.print("�������:");
				studentsVO.setS_birth(scanner.nextLine());
				
			
				System.out.print("�л�����:");
				studentsVO.setS_gender(scanner.nextLine());
			
				stDAO.update(studentsVO);
				
			
				PrintUtil.print_view(
						stDAO.view(studentsVO.getS_idx()));
				
			} else if(ch_num.equals("4")) {	//ȸ�������ϱ�.
				System.out.print("�л�������:");
				stDAO.delete(Integer.parseInt(scanner.nextLine()));
				PrintUtil.print_list(stDAO.list()); //ȸ����� ��������.
			
			}
		}
		
		// �л� �� �� ���
//		StudentsVO studentsVO = new StudentsVO();
//		studentsVO.setS_name("�̼���");
//		studentsVO.setS_gender("1");
//		stDAO.insert(studentsVO);
		
		//�л������� �ϳ� �����ɴϴ�.
//		StudentsVO studentsVO=stDAO.view(22);
//		PrintUtil.print_view(studentsVO);
		
		//�л������� �ϳ� ����
//		StudentsVO studentsVO = new StudentsVO();
//		studentsVO.setS_idx(22);
//		studentsVO.setS_name("�̼���");
//		studentsVO.setS_gender("2");
//		stDAO.update(studentsVO);
		
		//�л������� �ϳ� �����ɴϴ�.
	//	PrintUtil.print_view(stDAO.view(22));
		
		//�л� ��ϰ�������
//		ArrayList<StudentsVO> list = stDAO.list();
//		PrintUtil.print_list(list);
		
		//�л� �Ѹ� ����
//		stDAO.delete(32);
//		ArrayList<StudentsVO> list = stDAO.list(); //arraylist�Լ��� ��� ������ �������� ���ĵǾ� ���´�.
//		PrintUtil.print_list(list);
		
		scanner.close();
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
