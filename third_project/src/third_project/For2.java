package third_project;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		int sum=0;
			
		for(int i=1;i<=100;i++) {	
			sum=sum+i;	
			System.out.println(sum);	
			
		}
		
		System.out.println("1~100��:"+sum);	
			
		
		System.out.println("1~100���� ������ Ȧ��");	
		for(int i=1;i<=100;i++) {	
			if(i%2==0) {	
				System.out.println(i);		
			}		
		}	

		
		System.out.println("1~100���� ������ ¦��");	
		for(int i=1;i<=100;i++) {	
			if(i%2==1) {	
		
				System.out.println(i);	
				
			}
		}

			
			
		System.out.println("1~100���� ������ 3�ǹ��");	
		for(int i=1;i<=100;i++) {	
			if(i%3==0) {	//%�� ����������3�μ� ���ϴ°�.
				System.out.println(i);	
			}
		}

		
			//&& �̰� and ���ϴ°Ŷ� ������ �ΰ����϶��� �Ʒ�ó�� &&�� �̿��ؼ� ������ �ȴ�.
		System.out.println("1~100���� ������"+ "3�ǹ���̸鼭 2�ǹ��");	
		for(int i=1;i<=100;i++) {	
			if(i%2==0 && i%3==0){	
				System.out.println(i);	
					
			}
		}
		
		
		//�Ǵ� �϶���||�� ����Ѵ�.
		System.out.println("1~100���� ������"+ "3�ǹ�� �Ǵ� 2�ǹ��");	
		for(int i=1;i<=100;i++) {	
			if(i%2==0 || i%3==0){	
				System.out.println(i);	
						
			}
		}
			
		
		System.out.println("1~100���� ������"+"2�������ϴµ�"+ "3�ǹ�� �Ǵ� 2�ǹ��");	//1������ i++,1�� ����i=,2������i+=2
		for(int i=1;i<=100;i+=2) {	
			if(i%2==0 || i%3==0){	
				System.out.println(i);	
						
			}
		}
		
		
		
		
	}	
}
