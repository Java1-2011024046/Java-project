package final_practice;
//상속 예제. Animal이 부모클래스, Lion,Eagle이 자식클래스
public class Animaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion fir=new Lion();
		Animal tir=new Animal();
		fir.weight=100; // 상속했으니 자식클래스에서 , 부모클래스 변수받아서 초기화해도된다.
		fir.eat(40);
		System.out.println(fir.weight);
		fir.sleep(50);
		System.out.println(fir.weight);
		fir.roar();
		
		Eagle sec=new Eagle();
		System.out.println(sec.wing);
		sec.fly();
	}

}
