package third_project;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int[] scores= {83,90,87,45,56,67,23,89};	
		
	//	System.out.println("scores[0]:"+scores[0]);	
	//	System.out.println("scores[1]:"+scores[1]);	
	//	System.out.println("scores[2]:"+scores[2]);	
		
		int sum=0;	
	//	for(int i=0;i<3;i++) �� ������� �ص� �ǰ� �Ʒ�ó�� i<scores.length�� �ص� �ȴ�.�ٷ���ϴ� ���� �������� length�� ����.	
			for(int i=0;i<scores.length;i++) {	
				System.out.println("scores["+i+"]:"+scores[i]);	
				sum+=scores[i];
		}
		System.out.println("����:"+sum);	
		double avg=(double)sum/scores.length;	
		System.out.println("���:"+avg);
		
	}

}
