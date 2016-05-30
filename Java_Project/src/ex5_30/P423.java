package ex5_30;

public class P423 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl ac = new RemoteControl(){
			public void turnOn(){
				System.out.println("TV turnOn()");
			}
			public void turnOff(){
				System.out.println("TV turnOff()");
			}
		};
		ac.turnOn();
		ac.turnOff();
	}

}
