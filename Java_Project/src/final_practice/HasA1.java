package final_practice;

public class HasA1 {
	
	private String name;
	HasA birthdate;// 이렇게 has a 관계를 만들어 낸다.
	
	public HasA1(String name,HasA birthdate){//Has-a 관계 예제
		this.name=name;
		this.birthdate=birthdate;
	}
	
	public String toString(){
		return "name : " + name +"의 생일은  "+birthdate+"입니다";
	}

}
