package ex_5_9;

public class P295 {

	private int value=10;
		
		class InnerClass{
			public void myMethod(){
				System.out.println("�ܺ�Ŭ������ private ���� ��:"+value);
			}
		}
	P295(){
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}
