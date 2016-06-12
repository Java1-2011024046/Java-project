package final_practice;

public class SportCartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Sportcarson aa=new Sportcarson();
			aa.speed=200;
			aa.turbo=true;
			System.out.println(aa.speed);
			aa.setSpeed(150);
			aa.setTurbo(false);
			System.out.println(aa.turbo);
			

		}
	}//상속해서 각 메소드 실행한거 프린트한거임. 상속기초.
