package fin_chapter8;

interface Drivable {
	void drive();
}

interface Flyable{
	void fly();
}

public class FlyingCar1 implements Drivable, Flyable{
	public void drive(){
		System.out.println("�����ϴ� ��");
	}
	public void fly(){
		System.out.println("����ٴϴ� ��");
	}
	
	public static void main(String args[]){
		FlyingCar1 aa=new FlyingCar1();
		aa.drive();
		aa.fly();
	}
}
//���߻���� B,C�� A�� ��ӹ޾Ƽ� a�޼ҵ带 �Ѵ� �������̵� �� ��, D�� B,C���� ��ӹ����� a�޼ҵ�� ��� �°����� �Һи������� 
//�ڹٿ��� ���߻�� ����. ��ſ� �������̽��� ���߻�Ӱ� ���������.- �������̽��� ������ �����ϴ� ��.
//�ι��� ����� �ϳ��� Ŭ������ ��ӹް� ���ϳ��� �������̽��� �����Ѵ�. FlyingCar2���� ����!