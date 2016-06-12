package fin_chapter8;
//Default 메소드는 앞에 default라는 키워드를 추가해서 메소드 작성하면되고, public클래스에서 구현안해도 메소드 호출가능하다.

interface Default{//default 메소드
	public void my();
	
	default void my2(){
		System.out.println("defalt로 정의한 메소드");
	}
}

interface staticme{
	static void print(String msg){
		System.out.println(msg+" : 정적메소드 호출");
	}
}

public class DefaultStaticMethod implements Default{
	public void my(){
		System.out.println("이건 default메소드로 한거 아님");
	}
	
	public static void main(String args[]){
		DefaultStaticMethod dd=new DefaultStaticMethod();
		dd.my();
		dd.my2();//얘는 바로 위에서 메소드 안썻는데 구현됨
		
		staticme.print("바로되네!");//정적메소드로 호출. 앞에 정적메소드 어떤건지 다시 살펴보는게 좋을듯! 구현은 쉽네.
	}

}
//default메소드 쓰는 이유는 기존의 코드 안건들이고확장할 수있으니까. 개발자들이 많이 사용하는 인터페이스에 메소드하나 추가하면
//이거 쓰는 모든 class들이 다 고쳐야한다.