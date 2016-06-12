package fin_chapter8;

public class TelevisionTest {
	public static void main(String arg[]){
		Television aa = new Television();
		aa.turnOn();
		System.out.println(aa.onoff);
		aa.turnOff();
		System.out.println(aa.onoff);
	}
}