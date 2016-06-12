package final_practice;

public class AbsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle aa=new Rectangle();
		aa.draw();
		Circle bb=new Circle();
		bb.draw();
	    aa.move(10,25);
	    System.out.println(aa.product(10, 40));
	    System.out.println(aa.width);//width 가 private면 참조 안된다.
	}

}
