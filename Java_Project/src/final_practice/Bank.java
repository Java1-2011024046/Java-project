package final_practice;
//��� ���� �ε� ���� �ڽ�Ŭ�������� ���� class���� ���ص��ǳ�. ��� ������ �ڿ� ���� �ؾ��Ѵ�.
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