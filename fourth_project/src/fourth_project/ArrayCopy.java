package fourth_project;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		String[] oldStrArray= {"Java","Python","C++"};	
		String[] newStrArray= new String[5];												
			
		//�Ʒ�.System.arraycopy(�����迭,�����δ콺,�����ҹ迭,���� �������δ콺,�����Ұ���);
		System.arraycopy(oldStrArray, 0, newStrArray, 0,oldStrArray.length);	
	
		//�Ʒ� �ĵ��� �޸� ���� �ְ� �ϴ¹��.,
	for(int i=0;i<newStrArray.length;i++) {	
		if(i == newStrArray.length-1) {	
			System.out.println(newStrArray[i]);
		}else {	
			System.out.println(newStrArray[i]+",");
		}
		
	
	}

	}

}

	





