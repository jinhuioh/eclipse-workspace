package third_project;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			//random�� 0���� 0.9999�������� �Ʒ� ó�� 4���ϰ� 8���ϸ� ������ 8�̻�12�̸��� �ȴ�. (0�϶� 8���̰� 3.xxx�϶� 11.xxx��)	
		//Math.random:0~0.9999...
		int time=(int)(Math.random()*4)+8;	
		System.out.println("[����ð�:"+time+"��]");	
			
		switch(time) {	
		case 8:	
			System.out.println("����մϴ�.");	
		case 9:	
			System.out.println("ȸ�Ǹ� �մϴ�.");	
		case 10:	
			System.out.println("������ ���ϴ�.");
		default:	
			System.out.println("�ܱ����մϴ�.");
		
		}

	}

}
