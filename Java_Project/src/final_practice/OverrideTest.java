package final_practice;

public class OverrideTest extends Override {

	void eat(){
		super.eat();
		System.out.println("개가 먹고있다.");
	}
	
	void eat(int aa){
		System.out.println("개가 "+aa+"만큼 먹는다");
	}
	
}
