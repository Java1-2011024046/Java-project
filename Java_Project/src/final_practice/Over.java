package final_practice;

public class Over {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverrideTest tu=new OverrideTest();
		Override rr=new Override();
		tu.eat();//얘 class가보면 super키워드를 사용해서 부모클래스에 접근.
		rr.eat();//여기서 그냥 부모 클래스의 메소드 호출해도 된다
		tu.eat(10);		
	}

}
