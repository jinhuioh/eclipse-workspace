package fourth_project;

public class Ex1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//�迭�� ������ ���� 5���� �ְ� �ִ밪 ã��.	
		//������ ��.
		int max = 0;
		int[] intarr= {30,20,40,54,23};	
		
		for(int intar: intarr) {	
			if(max<intar) {	
				max=intar;
			}
		}
		
		System.out.println("max:"+max);
	}

}
