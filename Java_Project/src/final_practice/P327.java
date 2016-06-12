package final_practice;

class P327 {
	public P327(){
		System.out.println("부모클래스 생성자");//생성자는 객체 초기화해주는거 , 이거하면 메인에서 굳이 초기화안해도됨
	}
	void sss(){
		System.out.println("생성자랑 메소드랑 헷갈려서 써봄");
	}
};

class P327son extends P327{
	public P327son(){
		//super();
		System.out.println("자식클래스 생성자");
	}
};

