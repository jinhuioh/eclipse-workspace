package second_project;

public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int ���� char������ ���� ����ȯ �ϴ¹�� ()�ȿ� ����ȯ �� �� �Է��ϱ� �Ʒ�ó�� ������ ��. �ٵ� int ���� char������ ��ȯ�� �� ���� ũ���϶��� �Ұ���.
		int intvalue=44032;
		char charvalue=(char)intvalue;
		System.out.println(charvalue);
		
		long longvalue=500L;
		intvalue=(int)intvalue;
		System.out.println(intvalue);
		
		double doublevalue=3.14;
		intvalue=(int)doublevalue;
		System.out.println(intvalue);
		
		//....�Ʒ��� ���� ���� ���� ����ȯ ����
		String str="1000000";
		int str_int=Integer.parseInt(str);
		System.out.println("str_int:"+str_int);
		
		
		
	}

}
