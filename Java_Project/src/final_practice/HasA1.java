package final_practice;

public class HasA1 {
	
	private String name;
	HasA birthdate;// �̷��� has a ���踦 ����� ����.
	
	public HasA1(String name,HasA birthdate){//Has-a ���� ����
		this.name=name;
		this.birthdate=birthdate;
	}
	
	public String toString(){
		return "name : " + name +"�� ������  "+birthdate+"�Դϴ�";
	}

}
