package final_practice;

abstract class Abstrac {

	private int x,y;
	
	public void move(int x, int y){
		this.x=x;
		this.y=y;
	}
	public abstract void draw();
}
class Rectangle extends Abstrac{
	int width,height;
	int product(int a,int b){
		return width = a*b;
	}
	public void draw(){
		System.out.println("�簢�� �׸���");
	}
	
}

class Circle extends Abstrac{
	private int radius;
	public void draw(){
		System.out.println("���׸��� �޼ҵ�");
	}
}