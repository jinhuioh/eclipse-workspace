package object;
class calculator{	
	
	//����:641��,������� �¿��,
	//���������� ������ ���� �ٽ� �������� ���� ��ȯ���.
	//���� 641�� ������ ���������� ����ؼ� 
	//������ ���� �������� �ٽ� ���ƿ��� ��ȯ�����̴�.

	//static�϶�
	//	static int result=0;
//	static int add(int num)
	int result=0;
	int add(int num) {	
		result +=num;
		return result;
	}
}
public class Sample {

	public static void main(String[] args) {
		
		//static�� ���
//		System.out.println(calculator.add(10));
//		System.out.println(calculator.add(20));
		
		
		//static�� �ƴѰ��
//		calculator cal=new calculator();
//		System.out.println(cal.add(10));
//		System.out.println(cal.add(20));
		
		
		calculator cal1=new calculator();
		calculator cal2=new calculator();
		
		//static�� ���ָ� ���⸦ 2�� ���� ���ִ�.
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(20));
		
		System.out.println("=====");
		
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(40));
		

	}

}
