package second_project;

import java.io.IOException;

public class Keycode {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub.  ����ó��  throws IOException  �̰ź��̸� ����ó�� ����.
		
		//�׸��� �����Ű�� �ƹ��͵� �ȶߴµ� ����� â�� (consloeâ��) a�� �� ġ�� ���ڳ���.

		int keycode; 
		//system.in.read�� 1byte�� ���� �ϳ��� �д°�.�������A���Է��ϸ� �װ��а� �ش簪�� ����.
		keycode=System.in.read();
		System.out.println("keycode1:"+keycode);
		
		keycode=System.in.read();
		System.out.println("keycode2:"+keycode);
		
		keycode=System.in.read();
		System.out.println("keycode3:"+keycode);
		
	}

}
