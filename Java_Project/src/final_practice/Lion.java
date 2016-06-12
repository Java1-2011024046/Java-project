package final_practice;
//상속 예제. Animal이 부모클래스, Lion,Eagle이 자식클래스
public class Lion extends Animal{

	int leg=4;
	public void roar(){
		System.out.println("roar이 호출됨");
	}
}
//상속에서 public protected 는 자식에게 전달되는데 private는 전달안되고 그냥 그 클래스 안에서만 쓸수 있다.