package third_project;

public class Switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade='B';
			
		switch(grade) {	
			case 'A':	
			case 'a':	
				
				System.out.println("���ȸ���Դϴ�.");	
				break;
				
			case 'B':	
			case 'b':	
				
				System.out.println("�Ϲ�ȸ���Դϴ�.");	
				break;	
				
			default:	
				System.out.println("�մ��Դϴ�.");	
				
		}	
			
		String upper="    aBcdE ";	
				System.out.println(upper.toUpperCase());	//���δ빮�ڷ�
				System.out.println(upper.toLowerCase());	//���μҹ��ڷ�
				System.out.println(upper.trim()); //�յڰ��鸸 �����ֽÿ�	
				System.out.println(upper.replace("","")); //��""���ڸ� ��""�� ġȯ���ֽÿ�.
	}

}
