package third_project;

public class While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		while(true) {	//������ ��� ������
			int num=(int)(Math.random()*6)+1;	//1~6������
			System.out.println(num);	//������
			
			if (num==6) {	//����6�� ������
				break;     //�����.
			}
		}
		
		System.out.println("program finish"); //�׸��� program finish ��� �����.
	}

}
