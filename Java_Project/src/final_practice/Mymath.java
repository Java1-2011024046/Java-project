package final_practice;

public class Mymath {
	int square(int i){
		return i*i;
	}
	double square(double i){
		return i*i;
	}
	
	public static void main(String args[]){
		Mymath obj = new Mymath();
		System.out.println(obj.square(10));
		System.out.println(obj.square(9.9));
		
		int sau=obj.square(5);
		System.out.println(sau);
	}
}
//String class가 제공하는 method들 
//length() replace(char oldchar,char newchar) toLowerCase()...
