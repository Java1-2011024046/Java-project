package final_practice;
//��� ����. Animal�� �θ�Ŭ����, Lion,Eagle�� �ڽ�Ŭ����
public class Animaltest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion fir=new Lion();
		Animal tir=new Animal();
		fir.weight=100; // ��������� �ڽ�Ŭ�������� , �θ�Ŭ���� �����޾Ƽ� �ʱ�ȭ�ص��ȴ�.
		fir.eat(40);
		System.out.println(fir.weight);
		fir.sleep(50);
		System.out.println(fir.weight);
		fir.roar();
		
		Eagle sec=new Eagle();
		System.out.println(sec.wing);
		sec.fly();
	}

}
