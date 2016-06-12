package fin_chapter8;

public class P403Lab2 implements P403Lab{

	boolean go=false;
	boolean goo=true;
	int aa=0;
	int degree=0;
	
	public void start(){
		go=true;
	}
	public void stop(){
		goo=false;
	}
	public int setSpeed(int aa){
		return aa;
	}
	public int turn(int degree){
		return degree;
	}
	public void ex(int x){
		System.out.println("이렇게 여기서 println 해서 값 출력해도됨 "+ x);
	}
	
	public static void main(String arg[]){
		P403Lab2 hh = new P403Lab2();
		hh.start();
		hh.stop();
		int ac = hh.setSpeed(50);//이렇게 여기서 객체만들고 해도되고 아님 위에 클래스에서 print하는걸로 해도됨
		int ab = hh.turn(10);
		System.out.println("차 시동은"+hh.go+"차 멈춤은"+hh.goo+"속력은"+ac+"방향은"+ab);
		
		hh.ex(40);
	}
	
}
