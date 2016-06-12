package fin_chapter8;

public interface RemoteControl {
	public void turnOn();//인터페이스는 추상 클래스랑 유사하다.안에 선언되는 메소드들도 추상메소드인데 abstract생략함
	public void turnOff();
}

class Television implements RemoteControl{//인터페이스받는 거는 이렇게 표현한다.
	boolean onoff=false;
	public void turnOn(){
		onoff=true;//Tv전원을 키기 위한 코드가 들어간다.
	}
	
	public void turnOff(){
		onoff=false;//Tv전원을 끄기 위한 코드가 들어간다.
	}
	
}
//인터페이스와 추상클래스 차이
//추상클래스는 관련 클래스들 사이에 코드를 공유하고 싶다면 추상클래스, 공통필드나 메소드수가 많을때,public이외의 접근지정자를 사용해야하는경우.
//정적필드나 상수가 아닌 필드를 선언하기를 원할때.
//인터페이스는 관련없는 클래스들이 인터페이스를 구현하기를 원할때,특정자료형의 동작을 지정하고 싶은데 누가구현하던지 상관안할때,*다중상속이 필요할떄