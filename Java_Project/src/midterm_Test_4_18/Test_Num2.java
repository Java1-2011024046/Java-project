package midterm_Test_4_18;

import java.util.Scanner;

public class Test_Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Num2_1 Inputs = new Test_Num2_1() ;
		
		Scanner input = new Scanner(System.in);
		
		do{
		
		System.out.print("실행 번호를 입력하세요.");
		Inputs.choice=input.nextInt();
		if(Inputs.choice==1)
		{
		System.out.print("두 숫자를 입력하세요.");
		Inputs.input1=input.nextInt();
		Inputs.input2=input.nextInt();
		System.out.print(Inputs.input1+" "+Inputs.input2);
		}
			else if(Inputs.choice==2)
			{
			System.out.print("두 숫자와 실행할 연산자를 입력하세요.");
			Inputs.input1=input.nextInt();
			Inputs.input2=input.nextInt();
			Inputs.cal=input.nextInt();
			if(Inputs.cal==1)
				{
					System.out.print("두 수를 더하면 "+(Inputs.input1+Inputs.input2));
				}
			else if(Inputs.cal==2)
				{
					System.out.print("두 수를 뺴면"+(Inputs.input1-Inputs.input2));
				}
			else if(Inputs.cal==3)
				{
					System.out.print("두 수를 곱하면"+(Inputs.input1*Inputs.input2));
				}
			else if(Inputs.cal==4)
				{
				 	System.out.print("두수를 나누면"+((double)Inputs.input1/Inputs.input2));
				}
			else if(Inputs.cal==5)
				{
					System.out.print("두 수의 나머지는"+(Inputs.input1%Inputs.input2));
				}
			}
			else if(Inputs.choice==3)
				System.out.print("종료 합니다.");
		}
		while(Inputs.choice<0 || Inputs.choice>3);
	}

}
