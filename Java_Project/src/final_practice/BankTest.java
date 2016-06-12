package final_practice;
//상속 예제
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Bank aa =new Bank();
				Bad bb = new Bad();
				Normal cc=new Normal();
				Good dd = new Good();
				
				System.out.println("Bank의 이자율은 "+aa.rate()+"이고 Bad의 이자율은 "+bb.rate()
					+"이고 Normal의 이자율은"+cc.rate()+
					"이고 Good의 이자율은"+dd.rate()+"이다");
	}
}
	
