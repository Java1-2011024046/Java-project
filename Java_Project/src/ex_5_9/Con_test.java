package ex_5_9;

class Par{
	Par(){System.out.println("par con");}
	Par(int x){System.out.println("Par cono"+x);}
}

class child extends Par{
	public child(int y){
		super(y);
		System.out.println("child con");
		}
	public child() {System.out.println("child con nothing");}
}


public class Con_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			child c1=new child(4);
			child c2=new child();
	}

}
