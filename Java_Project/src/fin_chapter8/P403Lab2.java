package fin_chapter8;

public class P403Lab2 implements P403Lab{

	boolean go=false;
	boolean goo=true;
	int aa=0;
	int degree=0;
	
	public void start(){
		go=true;
	}
	public void stop(){
		goo=false;
	}
	public int setSpeed(int aa){
		return aa;
	}
	public int turn(int degree){
		return degree;
	}
	public void ex(int x){
		System.out.println("�̷��� ���⼭ println �ؼ� �� ����ص��� "+ x);
	}
	
	public static void main(String arg[]){
		P403Lab2 hh = new P403Lab2();
		hh.start();
		hh.stop();
		int ac = hh.setSpeed(50);//�̷��� ���⼭ ��ü����� �ص��ǰ� �ƴ� ���� Ŭ�������� print�ϴ°ɷ� �ص���
		int ab = hh.turn(10);
		System.out.println("�� �õ���"+hh.go+"�� ������"+hh.goo+"�ӷ���"+ac+"������"+ab);
		
		hh.ex(40);
	}
	
}
