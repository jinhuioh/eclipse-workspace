package third_project;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
			
		Scanner scanner=new Scanner(System.in);	
			
		//while(true)�� �ٿ��� �ܼ�â���� ���Ѵ�� ����ó�� ��밡��. ��� ���� ���񵵷� ����� ��ɹ�.
	while(true) {	
		int sum=0;	
		int init=Integer.parseInt(scanner.nextLine());	//int init=Integer.parseInt(scanner.nextLine()); ����int init=scanner.nextInt();�� ����.
		int i=init;	
		int end=Integer.parseInt(scanner.nextLine());
		
		while(i<=end) {	
			sum+=i;		
			if(i==end) {	
				break;
			}
			i++;
				
		}
		
		System.out.println("1~"+(i)+"��:"+sum);
	}
	}

}
//��ƴ�..........����
//�극��ũ(break)�� ���α׷��� ���� for �Ǵ� while ���� �ݺ���(Loop)�� ��� �� ����ϴ� ��ɾ��̴�.
//���ǹ��� switch������ ��� ���� ����Ѵ�. return���� ������� ��ȯ�ϴ� �ݸ�, break���� � ������� ��ȯ���� �ʴ´�.