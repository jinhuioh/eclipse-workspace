package second_project;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.3���� ���ڸ� �Է¹޾� ���� ū ���ڸ� ã���ÿ�.��.
		//�� ������ �� ���ͷ� ���β� ���缭 ����.�׷��� ���� ã�� ����
		//window,preferences,general,editor,texteditor,(�߰��뿡)show whitespace charactors ������ ���θ��߱� ����
		
		Scanner input=new Scanner(System.in);
		int num1,num2,num3;
		int max;
		
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();

		if(num1>=num2&&num1>=num3) {
			max=num1;
		}else if(num2>=num1&&num2>=num3) {
			max=num2;
		} else {
			max=num3;
		}
		System.out.println("����ū ����"+max+"�Դϴ�.");
		input.close();	
	}

}

//�����Թ��
//Scanner input=new Scanner(System.in);
//System.out.print("��1:");
//int value1=Integer.parseInt(scanner.nextLine());
//System.out.print("��2:");
/**
 * int value2=Integer.parseInt(scanner.nextLine());
 */
//System.out.print("��3:");
//int value3=Integer.parseInt(scanner.nextLine());

//if(value1>value2) {
//	if(value)
//}
//