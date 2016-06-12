package fin_chapter8;

interface Drivable {
	void drive();
}

interface Flyable{
	void fly();
}

public class FlyingCar1 implements Drivable, Flyable{
	public void drive(){
		System.out.println("운전하는 것");
	}
	public void fly(){
		System.out.println("날라다니는 것");
	}
	
	public static void main(String args[]){
		FlyingCar1 aa=new FlyingCar1();
		aa.drive();
		aa.fly();
	}
}
//다중상속은 B,C가 A로 상속받아서 a메소드를 둘다 오버라이딩 한 후, D가 B,C에서 상속받으면 a메소드는 어디서 온것인지 불분명해져서 
//자바에서 다중상속 금지. 대신에 인터페이스로 다중상속과 비슷해진다.- 인터페이스를 여러개 구현하는 것.
//두번쨰 방법은 하나의 클래스를 상속받고 또하나의 인터페이스를 구현한다. FlyingCar2에서 실험!