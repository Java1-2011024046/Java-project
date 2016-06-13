package fin_chapter8;
//무명클래스는 이름이 없는 클래스로 , 클래스르 정의 하면서 동시에 객체생성한다. 하나의 객체만 생성하면 될때 쓰인다.

interface Remote{
	public void turnOn();
	public void turnOff();
}

/*class nonAnon{
	public void turnOn(){
		
	}
	public void turnOff(){
		
	}
}원래 이렇게 클래스를 정의 해주고 밑에 객체를 생성해야하는데 한번만 생성할거라면 그냥 무명클래스로 정의 해주면된다. 밑에 처럼*/

public class AnonymousClass {

	public static void main(String args[]){
		
		Remote aa = new Remote(){  //무명클래스 정의 방법 : class(인터페이스)이름 객체 = new class(인터)이름()
			public void turnOn(){
				System.out.println("tv 켜라 .");
			}
			public void turnOff(){
				System.out.println("tv꺼라");
			}
		};
		aa.turnOn();
		aa.turnOff();
	}
	
}
