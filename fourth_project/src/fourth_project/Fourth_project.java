package fourth_project;

public class Fourth_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int sum=add(new int[] {83,45,76,23,65});	
		System.out.println("����:"+sum);	
		
		int[] array={83,45,76,23,65};	
		System.out.println("����:"+add(array));
		
	}
	/**	�̷��� �ּ� �޾Ƽ� ������ ����� ���� ����.
	 * 	���� �迭�� ���� ���ϴ� �Լ�.
	 * @param scores
	 * @return
	 */
	
	public static int add(int[] scores) {	
		int sum=0;	
		for(int i=0;i<scores.length;i++) {	
			sum+=scores[i];
		}	
		return sum;
		
	}
}
