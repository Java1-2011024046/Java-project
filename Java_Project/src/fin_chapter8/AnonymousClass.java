package fin_chapter8;
//����Ŭ������ �̸��� ���� Ŭ������ , Ŭ������ ���� �ϸ鼭 ���ÿ� ��ü�����Ѵ�. �ϳ��� ��ü�� �����ϸ� �ɶ� ���δ�.

interface Remote{
	public void turnOn();
	public void turnOff();
}

/*class nonAnon{
	public void turnOn(){
		
	}
	public void turnOff(){
		
	}
}���� �̷��� Ŭ������ ���� ���ְ� �ؿ� ��ü�� �����ؾ��ϴµ� �ѹ��� �����ҰŶ�� �׳� ����Ŭ������ ���� ���ָ�ȴ�. �ؿ� ó��*/

public class AnonymousClass {

	public static void main(String args[]){
		
		Remote aa = new Remote(){  //����Ŭ���� ���� ��� : class(�������̽�)�̸� ��ü = new class(����)�̸�()
			public void turnOn(){
				System.out.println("tv �Ѷ� .");
			}
			public void turnOff(){
				System.out.println("tv����");
			}
		};
		aa.turnOn();
		aa.turnOff();
	}
	
}
