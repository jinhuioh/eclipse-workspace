package fourth_project;

public class MainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		//�̰� �׳� �����ϸ� �ȵǴµ� Run as->Run configurations���� Arguments���� program arguments
		//â���� ���� 10 20 789�̷������� �����ؼ� �Է��ϸ� ������.
		
		String strNum1=args[0];	
		String strNum2=args[1];	
		String strNum3=args[2];
		
		int num1 = Integer.parseInt(strNum1);	
		int num2 = Integer.parseInt(strNum2);		
		int num3 = Integer.parseInt(strNum3);	
			
		int result = num1+num2+num3;	
		System.out.println(result);
	}

}
