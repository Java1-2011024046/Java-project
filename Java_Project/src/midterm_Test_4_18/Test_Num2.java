package midterm_Test_4_18;

import java.util.Scanner;

public class Test_Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_Num2_1 Inputs = new Test_Num2_1() ;
		
		Scanner input = new Scanner(System.in);
		
		do{
		
		System.out.print("���� ��ȣ�� �Է��ϼ���.");
		Inputs.choice=input.nextInt();
		if(Inputs.choice==1)
		{
		System.out.print("�� ���ڸ� �Է��ϼ���.");
		Inputs.input1=input.nextInt();
		Inputs.input2=input.nextInt();
		System.out.print(Inputs.input1+" "+Inputs.input2);
		}
			else if(Inputs.choice==2)
			{
			System.out.print("�� ���ڿ� ������ �����ڸ� �Է��ϼ���.");
			Inputs.input1=input.nextInt();
			Inputs.input2=input.nextInt();
			Inputs.cal=input.nextInt();
			if(Inputs.cal==1)
				{
					System.out.print("�� ���� ���ϸ� "+(Inputs.input1+Inputs.input2));
				}
			else if(Inputs.cal==2)
				{
					System.out.print("�� ���� ����"+(Inputs.input1-Inputs.input2));
				}
			else if(Inputs.cal==3)
				{
					System.out.print("�� ���� ���ϸ�"+(Inputs.input1*Inputs.input2));
				}
			else if(Inputs.cal==4)
				{
				 	System.out.print("�μ��� ������"+((double)Inputs.input1/Inputs.input2));
				}
			else if(Inputs.cal==5)
				{
					System.out.print("�� ���� ��������"+(Inputs.input1%Inputs.input2));
				}
			}
			else if(Inputs.choice==3)
				System.out.print("���� �մϴ�.");
		}
		while(Inputs.choice<0 || Inputs.choice>3);
	}

}
