package final_practice;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape aa=new rec();
		rec bb =new rec();
		aa.x=10;
		aa.y=20;
		System.out.println(aa.x +","+ aa.y);
		
		bb.x=5;
		bb.y=6;
		bb.height=10;
		bb.width=9;
		System.out.println("x는"+bb.x+" y는"+bb.y+" height는"+bb.height+" width는"+bb.width);
		//aa.width; 이거는 자식클래스가 private 인지public인지 상관없이 부모클래스에서 생성된 객체기 떄문에 자식 변수못씀.
		//aa.heigth;
	}

}
