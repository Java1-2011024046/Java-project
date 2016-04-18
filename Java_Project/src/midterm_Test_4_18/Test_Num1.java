package midterm_Test_4_18;

public class Test_Num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=8; i>=1;i--){  //각 층?을 표시하기 위한 for 문입니다.
			for(int j=1; j<=6;j++){// 층 마다 가로로 붙은 숫자를 위한 for문입니다.
				if(i>=7 && j==5)
				{	System.out.print(i+"0"+"4"); //j>=4 한뒤 continue로 실행하니 3까지만 출력되서어 양식에 맞추기위해 적음
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
		System.out.println("<<학번 : 2011024046>>"); 
	}

}
