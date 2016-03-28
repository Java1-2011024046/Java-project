package Sample_0328;

public class product_chart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=9;x++){
			for(int y=3 ; y<=9; y+=2){
				System.out.print(y+"*"+x+"="+(x*y)+" ");
			}
			System.out.println(" ");
		}

	}

}
