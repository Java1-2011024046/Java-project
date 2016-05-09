package ex_5_9;

public class P295 {

	private int value=10;
		
		class InnerClass{
			public void myMethod(){
				System.out.println("외부클래스의 private 변수 값:"+value);
			}
		}
	P295(){
		InnerClass obj = new InnerClass();
		obj.myMethod();
	}
}
