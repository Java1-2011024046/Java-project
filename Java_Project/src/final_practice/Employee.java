//클래스,메소드 심층탐구 LAb 종합?
package final_practice;
//직원 객체가 호출될 때 마다 직원수 1씩 증가하는 것
public class Employee {
  
	private String name;
	private int age;
	private String sex;
	
	int id;
	static int number;//직원수를 받기 위한 정적변수.
	
	public Employee(String na,String s,int a){
		name=na;
		sex=s;
		age=a;
		
		id=++number;
	}
	static int sumem(){
		return number;
	}//정적메소드로 직원수 받기
	
	//protected void finalize(){
	//	number--;
	//}//직원수가 감소하면 빼준다. 근데 굳이 안해줘도 뺴지는데?뭐징
	
	public String toString(){
		return("이름은 "+name+"이고, 성별은 "+sex+"이고, 나이는"+age+"입니다." );
	}
	
	public static void main(String args[]){
		Employee Em1 = new Employee("정재학","남",24);
		Employee Em2 = new Employee("이다은","여",25);
		Employee Em3 = new Employee("가나다","남",33);
		
		int n = Employee.number; //정적 변수로 직원수 한거
		int tt= Employee.sumem();//정적 메소드로 직원 수 한거
		
		System.out.println("정적메소드로 받은 직원수"+tt);
		System.out.println("생성된 직원 수는 "+ n);
		System.out.println(Em1);
		System.out.println(Em2);
		System.out.println(Em3);
		
	}
}
