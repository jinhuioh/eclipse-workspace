package second_project;

import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//�������ϱ� ����Ʈ ���ϸ� ���� ������ �����ִ�. 

		Scanner scanner=new Scanner(System.in);
	    String inputData;
		while(true) {
			inputData=scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�:\""+inputData+"\"");
			if (inputData.equals('q')){
				break;
			}
		}
		System.out.println("����"); 
	}
	
}