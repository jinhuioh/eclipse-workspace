package second_project;

public class stringconcatEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=10+2+8;
		System.out.println("value:"+value);
		
		String str1=10+2+"8";
		System.out.println("str1:"+str1);
		
		//String str1=(10+2+Integer.parseInt("8"))+"";
		String str2=10+"2"+8;
		System.out.println("str2:"+str2);
		
		String str3="10"+2+8;
		System.out.println("str3:"+str3);

		String str4="10"+(2+8);
		System.out.println("str4:"+str4);
		

	}

}
