package fin_chapter8;

class Drivab{
	void setspeed(){
		System.out.println("�ڵ��� ź��");
	}
}

interface Flyab{
	void Fly();
}
//�������̽����� ��� �����ϸ� �ڵ����� abstract ��� �̴� . ������ Myconstants.NORTH�ε� ���������� �׳�NORTH�ξ�
interface Myconstants{
	int NORTH=1;
	int SOUTH=2;
}


public class FlyingCar2 extends Drivab implements Flyab {
	
	int speed;
	
	void setspeed(){
		System.out.println("�ڵ��� Ÿ�� ����!");
	}
	public void Fly(){
		System.out.println("�ϴ��� ���� ����");
	}
	//Ŭ���� ��Ӱ� �������̽� ���� �ϴ°�.�ؿ��� ���⼭ �׳� �޼ҵ��ϳ� �������
	public int speed(int ss){
		return speed=ss;
	}
	
	
	public static void main(String args[]){
		FlyingCar2 aa= new FlyingCar2();
		aa.setspeed();
		aa.Fly();
		
		aa.speed(30);
		System.out.println(aa.speed);
		System.out.println(Myconstants.NORTH);//�������̽� ��� �����غ���
	}
}
