package final_practice;

public class OverrideTest extends Override {

	void eat(){
		super.eat();
		System.out.println("���� �԰��ִ�.");
	}
	
	void eat(int aa){
		System.out.println("���� "+aa+"��ŭ �Դ´�");
	}
	
}
