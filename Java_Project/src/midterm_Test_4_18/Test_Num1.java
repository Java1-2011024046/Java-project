package midterm_Test_4_18;

public class Test_Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=8; i>=1;i--){  //�� ��?�� ǥ���ϱ� ���� for ���Դϴ�.
			for(int j=1; j<=6;j++){// �� ���� ���η� ���� ���ڸ� ���� for���Դϴ�.
				if(i>=7 && j==5)
				{	System.out.print(i+"0"+"4"); //j>=4 �ѵ� continue�� �����ϴ� 3������ ��µǼ��� ��Ŀ� ���߱����� ����
					break;
				}
				else if(i==1 && j==4)
				{
					System.out.print("    ");
				    continue;
				}
				else if (i==1 && j==5)
				{
					System.out.print("    ");
					continue; 
				}
				else if(i>=5 && j==4)
					continue;
				else if(i>=5 && j==5)
					continue;
				
					System.out.print(i+"0"+j+" ");
					
			}
			System.out.println(" ");
		}
		System.out.println("<<�й� : 2011024046>>"); 
	}

}
