package Sample_0502;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj1=new Box(10,20,50);
		Box obj2=new Box(10,30,30);
		
		System.out.println(obj1.getHeight()+" "+obj2.getHeight());
			
		Box largest =obj1.whosLargest(obj1, obj2);
		System.out.println("("+largest.getWidth()+","+largest.getLength()+","+largest.getHeight()+")");
		
	}

}
