package Sample_0328;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar={1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<=9 ; i++){
			System.out.println(ar[i]);
		}
		int[] ar2=new int[10];
		for(int j=0; j<=9; j++){
			ar2[j]=j+1;
			System.out.println(ar2[j]);
		}
		
		for(int x: ar2){  //for ~ each 구문이라 한다.
			System.out.println("for ~ each "+x);
		}
		
		int [][] ar3= new int[2][3];
		for(int x=0;x<=1;x++){  //int x=0, r=0;x<=1;x++ 하고 ar3[][]=r 해도 된다.
			for(int y=0;y<=2;y++){
				ar3[x][y]=x*3+y+1;
				System.out.println(ar3[x][y]);
			}
		}
	}

}
