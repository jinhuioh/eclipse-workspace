package second_project;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1=Integer.parseInt("10");
		double value2=Double.parseDouble("3.14");
		boolean value3=Boolean.parseBoolean("true");
		
		System.out.println("value1:"+value1);
		System.out.println("value2:"+value2);
		System.out.println("value3:"+value3);
		
		String str1=String.valueOf(10);
		String str2=String.valueOf(3.14);
		String str3=String.valueOf(true);
		
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		//위아래 같은식인데 표현만 다른거. 아래꺼 추천.
		System.out.println(""+10);
		System.out.println(""+3.14);
		System.out.println(""+true);
		

		

	}

}
