package Sample_0502;

public class Cartest {

	//Car c1=new Car("Prius", "Light Gray",200); 여기는 하면 안에서 c1. 이렇게 못쓴다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Car.numbers);
		//c1.~~~안되
		Car c1=new Car("Prius", "Light Gray",200);
		
		System.out.println(Car.numbers);
		
	//이거는 이 클래스에서 만든것만 체크할 수 있다.
	}

}
