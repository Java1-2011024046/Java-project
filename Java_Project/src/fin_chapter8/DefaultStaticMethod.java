package fin_chapter8;
//Default �޼ҵ�� �տ� default��� Ű���带 �߰��ؼ� �޼ҵ� �ۼ��ϸ�ǰ�, publicŬ�������� �������ص� �޼ҵ� ȣ�Ⱑ���ϴ�.

interface Default{//default �޼ҵ�
	public void my();
	
	default void my2(){
		System.out.println("defalt�� ������ �޼ҵ�");
	}
}

interface staticme{
	static void print(String msg){
		System.out.println(msg+" : �����޼ҵ� ȣ��");
	}
}

public class DefaultStaticMethod implements Default{
	public void my(){
		System.out.println("�̰� default�޼ҵ�� �Ѱ� �ƴ�");
	}
	
	public static void main(String args[]){
		DefaultStaticMethod dd=new DefaultStaticMethod();
		dd.my();
		dd.my2();//��� �ٷ� ������ �޼ҵ� �ț��µ� ������
		
		staticme.print("�ٷεǳ�!");//�����޼ҵ�� ȣ��. �տ� �����޼ҵ� ����� �ٽ� ���캸�°� ������! ������ ����.
	}

}
//default�޼ҵ� ���� ������ ������ �ڵ� �Ȱǵ��̰�Ȯ���� �������ϱ�. �����ڵ��� ���� ����ϴ� �������̽��� �޼ҵ��ϳ� �߰��ϸ�
//�̰� ���� ��� class���� �� ���ľ��Ѵ�.