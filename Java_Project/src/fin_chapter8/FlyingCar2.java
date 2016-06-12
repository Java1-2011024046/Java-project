package fin_chapter8;

class Drivab{
	void setspeed(){
		System.out.println("자동차 탄당");
	}
}

interface Flyab{
	void Fly();
}
//인터페이스에서 상수 정의하면 자동으로 abstract 상수 이다 . 보통은 Myconstants.NORTH인데 구현받으면 그냥NORTH로씀
interface Myconstants{
	int NORTH=1;
	int SOUTH=2;
}


public class FlyingCar2 extends Drivab implements Flyab {
	
	int speed;
	
	void setspeed(){
		System.out.println("자동차 타는 성질!");
	}
	public void Fly(){
		System.out.println("하늘을 나는 성질");
	}
	//클래스 상속과 인터페이스 구현 하는것.밑에는 여기서 그냥 메소드하나 만들거임
	public int speed(int ss){
		return speed=ss;
	}
	
	
	public static void main(String args[]){
		FlyingCar2 aa= new FlyingCar2();
		aa.setspeed();
		aa.Fly();
		
		aa.speed(30);
		System.out.println(aa.speed);
		System.out.println(Myconstants.NORTH);//인터페이스 상수 구현해본것
	}
}
