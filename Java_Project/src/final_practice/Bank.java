package final_practice;
//상속 예제 인데 각각 자식클래스들을 따로 class만들어서 안해도되네. 대신 메인은 뒤에 만들어서 해야한다.
class Bank {
	double rate(){
		return 0.0;
	}
}

class Bad extends Bank{
	double rate(){
		return 10.0;
	}
}

class Normal extends Bank{
	double rate(){
		return 5.0;
	}
}

class Good extends Bank{
	double rate(){
		return 2.5;
	}
}