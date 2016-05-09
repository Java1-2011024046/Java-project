package ex_5_9;

abstract class Animalp347 {
	abstract void sound();//{System.out.println("Animal class sound()");}
}

class Dog extends Animalp347{
	private int dog=11;
	@Override
	void sound(){
		System.out.println("멍멍");
	}
}

class Cat extends Animalp347{
	private int cat=99;
	@Override  //혼동 되지 않으려고! 오버라이딩하는거는 추상된 class는 쓰는게아닌데 나중에 지워버릴까봐
	void sound(){
		System.out.println("야옹");
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
