package Sample_0502;

public class Box {
	private int width,length, height;
	private int volume;
	
	Box(int w,int l,int h){
		width=w;
		length=l;
		volume=w*l*h;
	}
	Box whosLargest(Box box1, Box box2){
		if(box1.volume>box2.volume)
			return box1;
		else 
			return box2;
	}
	
	void method2(Box obj1){
			Box temp=new Box(7,8,9);
			temp.width=obj1.width;
			temp.length=obj1.length;
			temp.width=obj1.width;
			temp.volume=obj1.volume;
			
	}
	
	
	
	
	
	
	
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
