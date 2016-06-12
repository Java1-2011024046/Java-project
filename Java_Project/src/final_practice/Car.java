//정적변수,생성자 ,정적 메소드, 상수 등 

package final_practice;

public class Car {

	String name;
	String color;
	int speed;
	
	int id;
	static int number=0;
	
	public Car(String n, String c, int s)//메소드?생성자!class이름과 같고,반환값안가짐,필드들을 초기화하려고?
	{
		name=n; // this.는 이 생성자가호출된 객채를 의미한다.굳이 붙일필요없다? this는 생성자의 매개변수이름이랑 필드이름이 같을때!
		color=c;//혹은 this 를 이용해 클래스에서 다른 생성자를 호출할때 사용
		speed=s;
		
		id=++number;
	}
//정적 메소드 
	public static int getnum(){
		return number;
	}
	public static int sumnum(int speed){
		return speed+50;
	}
	static final int MAXspeen=500;//정적 상수
	static{
		number=10;//위애 정적 변수 numeber을 10으로 초기화 시킴 따라서 밑에 int n Car.number하면 10+2되서 12출력
	}
	public String toString(){
		return ("이름은:"+name+" 색상은 :"+color+" 최고속력은:"+speed+"입니다.");
	}
	
	public static void main(String args[]){
		
		Car test1=new Car("쉐보레","black",250);
		Car test2=new Car("삼성르노","White",200);//생성자로 객체만들었는데 굳이 print안해도 되긴됨
		int n=Car.number;//정적 변수
		int tt =Car.getnum();//정적메소드호출
		int ss=Car.sumnum(test1.speed);
		System.out.println("정적메소드의 매개변수써봄 speed+50 : "+ss);
		System.out.println("정적변수를 이용한, 지금까지 생성된 차는"+n);
		System.out.println("정적메소드를 사용한,현재까지 생성된 차는"+tt);
		System.out.println
		("차종"+test1.name+"색상은 : "+test1.color+"최고 속력은:"+test1.speed+"입니다.");//객체 나타낼때 이렇게
		System.out.println(test1);//위에 public String toString하면 이런 형식으로 출력된다.
		System.out.println(test2);
		System.out.println(test1.MAXspeen);//정적 상수
		System.out.println(Car.MAXspeen);//이므로 객체나 여기나 다같다.
	}
	
}
