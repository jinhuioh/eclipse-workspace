package fourth_project;

public class ArrayCreate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		/**
		 * �迭�����ϴ¹��
		 */
		int[] intarray=new int[3];	
		intarray[0]=90;	
		intarray[1]=70;	
		intarray[2]=89;	
		print(intarray);
			
		double[] doublearray=new double[3];	
		doublearray[0]=0.1;	
		doublearray[1]=0.4;	
		doublearray[2]=0.6753;	
		print(doublearray);
			
		String[] stringarray=new String[3];	
		stringarray[0]="1��";	
		stringarray[1]="2��";	
		stringarray[2]="3��";		
		print(stringarray);
	}
	
		
		public static void print(int[] str) {
			for(int i=0;i<str.length;i++) {	
			System.out.println("��["+i+"]"+str[i]);
			
				}		
			}
				
		public static void print(double[] str) {
			for(int i=0;i<str.length;i++) {	
			System.out.println("��["+i+"]"+str[i]);
			
				}		
			}
		
		public static void print(String[] str) {
			for(int i=0;i<str.length;i++) {	
			System.out.println("��["+i+"]"+str[i]);
			
				}		
			
		
	}

}
