package second_project;

public class LogicOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode='a';//65
		System.out.println("charCode:"+charCode);
		
		if((charCode >=65)&(charCode<=90)) {
			System.out.println("�빮�� �̱���.");	
		}
		if((charCode >=97)&&(charCode<=122)) {
			System.out.println("�ҹ��� �̱���.");	
		}
//&& ���ʽ� �����ʽ� �߿� ���� �´��� �Ѵ� ���°�.&���ʸ� ���°�. && �̷��� �ΰ� ���°� ��õ.
		if((charCode >=48)&!(charCode<=57)) {
			System.out.println("0~9���� �̱���.");	
		}
	}

}
