package object;

class Animal{	
	String name;
	void setName(String name) {	
		this.name = name; /*this �� String name �� �ǹ�*/
	}
}

class Dog extends Animal{	
	//����Ŭ�������� name�� ���� ������ ������ �θ�Ŭ����=AnimalŬ������ �ִ� ������ ��ӹ޾Ƽ�(extends)
	//System.out.println(dog.name);���� ���� �޾ƿ� �� �ִ�.
	void sleep() {	
		System.out.println(this.name+"�� �ܴ�.");
	}
}
public class Sample2 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setName("�۸���");
		System.out.println(dog.name);
		dog.sleep();//�θ𿡰Դ� ������ �ڽĿ��Դ� �ִ� sleep�� ��������.
		/*IS - A����
		���� �����̴١��� �ǹ�*/
		Animal dog2=new Dog();
		//Object java �ֻ��� ��ü(������ ��ӹ޴� ��ü)(class)
		Object obj=new Dog();
	
	
	}

}
