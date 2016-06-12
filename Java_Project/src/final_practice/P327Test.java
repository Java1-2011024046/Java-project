package final_practice;

public class P327Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P327son aa =new P327son();//이거해주면 부모클래스인 P327하고 자식클래스 둘다 나온다.왜냐면 부모클래스 생성자도
		//초기화 되어야하니까? 그래서 안적어주면 헷갈리니까 자식클래스에서 부모클래스를 초기화시켜놓는게 낫다..
		aa.sss();//얘는 메소드라서 여기서 호출.
	}

}
