//Ŭ����,�޼ҵ� ����Ž�� LAb ����?
package final_practice;
//���� ��ü�� ȣ��� �� ���� ������ 1�� �����ϴ� ��
public class Employee {
  
	private String name;
	private int age;
	private String sex;
	
	int id;
	static int number;//�������� �ޱ� ���� ��������.
	
	public Employee(String na,String s,int a){
		name=na;
		sex=s;
		age=a;
		
		id=++number;
	}
	static int sumem(){
		return number;
	}//�����޼ҵ�� ������ �ޱ�
	
	//protected void finalize(){
	//	number--;
	//}//�������� �����ϸ� ���ش�. �ٵ� ���� �����൵ �����µ�?��¡
	
	public String toString(){
		return("�̸��� "+name+"�̰�, ������ "+sex+"�̰�, ���̴�"+age+"�Դϴ�." );
	}
	
	public static void main(String args[]){
		Employee Em1 = new Employee("������","��",24);
		Employee Em2 = new Employee("�̴���","��",25);
		Employee Em3 = new Employee("������","��",33);
		
		int n = Employee.number; //���� ������ ������ �Ѱ�
		int tt= Employee.sumem();//���� �޼ҵ�� ���� �� �Ѱ�
		
		System.out.println("�����޼ҵ�� ���� ������"+tt);
		System.out.println("������ ���� ���� "+ n);
		System.out.println(Em1);
		System.out.println(Em2);
		System.out.println(Em3);
		
	}
}
