//��������,������ ,���� �޼ҵ�, ��� �� 

package final_practice;

public class Car {

	String name;
	String color;
	int speed;
	
	int id;
	static int number=0;
	
	public Car(String n, String c, int s)//�޼ҵ�?������!class�̸��� ����,��ȯ���Ȱ���,�ʵ���� �ʱ�ȭ�Ϸ���?
	{
		name=n; // this.�� �� �����ڰ�ȣ��� ��ä�� �ǹ��Ѵ�.���� �����ʿ����? this�� �������� �Ű������̸��̶� �ʵ��̸��� ������!
		color=c;//Ȥ�� this �� �̿��� Ŭ�������� �ٸ� �����ڸ� ȣ���Ҷ� ���
		speed=s;
		
		id=++number;
	}
//���� �޼ҵ� 
	public static int getnum(){
		return number;
	}
	public static int sumnum(int speed){
		return speed+50;
	}
	static final int MAXspeen=500;//���� ���
	static{
		number=10;//���� ���� ���� numeber�� 10���� �ʱ�ȭ ��Ŵ ���� �ؿ� int n Car.number�ϸ� 10+2�Ǽ� 12���
	}
	public String toString(){
		return ("�̸���:"+name+" ������ :"+color+" �ְ�ӷ���:"+speed+"�Դϴ�.");
	}
	
	public static void main(String args[]){
		
		Car test1=new Car("������","black",250);
		Car test2=new Car("�Ｚ����","White",200);//�����ڷ� ��ü������µ� ���� print���ص� �Ǳ��
		int n=Car.number;//���� ����
		int tt =Car.getnum();//�����޼ҵ�ȣ��
		int ss=Car.sumnum(test1.speed);
		System.out.println("�����޼ҵ��� �Ű������ẽ speed+50 : "+ss);
		System.out.println("���������� �̿���, ���ݱ��� ������ ����"+n);
		System.out.println("�����޼ҵ带 �����,������� ������ ����"+tt);
		System.out.println
		("����"+test1.name+"������ : "+test1.color+"�ְ� �ӷ���:"+test1.speed+"�Դϴ�.");//��ü ��Ÿ���� �̷���
		System.out.println(test1);//���� public String toString�ϸ� �̷� �������� ��µȴ�.
		System.out.println(test2);
		System.out.println(test1.MAXspeen);//���� ���
		System.out.println(Car.MAXspeen);//�̹Ƿ� ��ü�� ���⳪ �ٰ���.
	}
	
}
