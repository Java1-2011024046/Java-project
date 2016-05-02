package Sample_0502;

public class Car {
	private String model;
	private String color;
	private int speed;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNumbers() {
		return numbers;
	}

	public static void setNumbers(int numbers) {
		Car.numbers = numbers;
	}

	private int id;
	static int numbers=0;
	
	public Car(String m, String c, int s){
		model=m;
		color=c;
		speed=s;
		
		id=++numbers;
	}
	static int Car_Numbers() {return numbers;}; //static 에서는 일반인것은 객체가없기 땜에 쓸수가없다.
		
}
