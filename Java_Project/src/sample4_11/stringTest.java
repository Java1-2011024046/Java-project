package sample4_11;

public class stringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String proverb = "A barking dog";
		String s1,s2,s3,s4;
		boolean test;
		
		System.out.println("문자열 길이="+ proverb.length());
		
		s1=proverb.concat ("never Bite!");
		s2=proverb.replace('b','B');
		s3=proverb.substring(2,6);
		s4=proverb.toUpperCase();
		test = proverb.equals(s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(test);
	}

}
