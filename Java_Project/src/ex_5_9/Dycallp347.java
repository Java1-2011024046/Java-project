package ex_5_9;

abstract class Animalp347 {
	abstract void sound();//{System.out.println("Animal class sound()");}
}

class Dog extends Animalp347{
	private int dog=11;
	@Override
	void sound(){
		System.out.println("�۸�");
	}
}

class Cat extends Animalp347{
	private int cat=99;
	@Override  //ȥ�� ���� ��������! �������̵��ϴ°Ŵ� �߻�� class�� ���°Ծƴѵ� ���߿� �����������
	void sound(){
		System.out.println("�߿�");
	}
}


public class Dycallp347 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animalp347 animal= new Animalp347();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		Animalp347 obj;
		
		//obj=animal;
		//obj.sound();
		
		obj=dog;
		obj.sound();
		
		obj=cat;
		obj.sound();
		
			
	}

}
