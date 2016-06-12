package final_practice;
//내부클래스 외부클래스 연습
public class Outerclass {

	private int ii=0;//Outerclass에서 private로 선언했지만 내부클래스에서 사용가능하다.
	private int tttt=10;
	
	class Innerclass{
		public void meth(){//얘는 내부클래스의 생성자:객체 초기화해주는거/메소드는 실행하는?
			System.out.println("외부클래스의 private변수 참조값 :"+ii);
		}		
	}
	Outerclass(){ //생성자. 객체가 생성될때 초기화하는 특수한 메소드 , 클래스이름이랑 같아야한다.
		Innerclass obj = new Innerclass();
		obj.meth();
	}
	
	void display(){    //메소드
		
		final String msg="Local class 외부클래스 변수 값 예졔 값은 : ";//정적상수
		
		class local{
			void prtmsg(){
				System.out.println(msg+tttt);
			}
		}
		local aaa = new local(); //지역 class에대한 객체생성
		aaa.prtmsg();  //지역class메소드호출
		
	}
	
	
	public static void main(String agrs[]){
		Outerclass bjbj= new Outerclass();
		bjbj.display();
	}
	
}
