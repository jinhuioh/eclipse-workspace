package second_project;

public class OperrationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//byte ������ �ջ��� �Ұ���. +��int�� �ؾ���.(�Ʒ���byte bytevalue3=bytevalue1+bytevalue2; �̰� ���� �����ϸ� ������.
		byte bytevalue1=10;
		byte bytevalue2=20;
		//byte bytevalue3=bytevalue1+bytevalue2;
		int bytevalue3=bytevalue1+bytevalue2;
		System.out.println(bytevalue3);
		
		char charvalue1='A';
		char charvalue2=1;
		//char charvalue3=charvalue1+charvalue2;   �̰͵� ����ó�� �ջ���int�� �ؾ��� char�� �ϸ� ������	
		int intvalue2=charvalue1+charvalue2;
		System.out.println("�����ڵ�:"+intvalue2);
		System.out.println("����:"+(char)intvalue2);
		
		int intvalue3=10;
		int intvalue4=intvalue3/4;
		System.out.println(intvalue4);
		
		int intvalue5=10;
		//int intvalue6=10/4.0;
		double doublevalue=intvalue5/4.0;
		System.out.println(doublevalue);

		int x=1;
		int y=2;
		double result=(double)x/y;
		//double result=x/y; ��� �ϸ� int ���� �����̱� ������ �Ҽ��� �ڸ��� �������� ���ప�� 0.0�� ���´�.
		//�׷��� �Ҽ��� �ڸ����� ������ double ������ �����޶�� ��ȣ�� ����ó�� �������.
		System.out.println(result);
		
		
	}

}
