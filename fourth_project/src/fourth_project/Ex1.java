package fourth_project;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� ������ ���� 5���� �ְ� �ִ밪 ã��.
			
			
	//�Ʒ����� ���� �ϴٰ� ����.����������
		
		
			
		Scanner input=new Scanner(System.in);
		int num1,num2,num3,num4,num5;
		int max;
		
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();	
		num4=input.nextInt();	
		num5=input.nextInt();

		if(num1>=num2&&num1>=num3&&num1>=num4&&num1>=num5) {
			max=num1;
		} else if(num2>=num1&&num2>=num3&&num2>=num4&&num2>=num5) {
			max=num2;
		} else if(num3>=num1&&num3>=num2&&num3>=num4&&num3>=num5) {
			max=num3;
		} else if(num4>=num1&&num4>=num2&&num4>=num3&&num4>=num5) {
			max=num4;
		} else if(num5>=num1&&num5>=num2&&num5>=num3&&num5>=num4) {	
			max=num5;
			
		
		int[] array={num1,num2,num3,num4,num5};	
		System.out.println("����ū��:"+Max(array));	
		
		
		
	}

}

		
	}

}
