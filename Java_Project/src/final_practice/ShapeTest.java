package final_practice;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape aa=new rec();
		rec bb =new rec();
		aa.x=10;
		aa.y=20;
		System.out.println(aa.x +","+ aa.y);
		
		bb.x=5;
		bb.y=6;
		bb.height=10;
		bb.width=9;
		System.out.println("x��"+bb.x+" y��"+bb.y+" height��"+bb.height+" width��"+bb.width);
		//aa.width; �̰Ŵ� �ڽ�Ŭ������ private ����public���� ������� �θ�Ŭ�������� ������ ��ü�� ������ �ڽ� ��������.
		//aa.heigth;
	}

}
