package final_practice;

public class HasAtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HasA uu=new HasA(2011,5,23);
		HasA1 bb=new HasA1("재학",uu);//HasA에서 만든 객체를 적어줘야한다.
		System.out.println(uu);
		uu.HH();
		System.out.println(bb);
	}

}
