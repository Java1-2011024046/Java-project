package final_practice;

public class TimeTest {

	int hour;
	int min;
	int sec;
	
	public TimeTest(int h,int m,int s)
	{
		hour = ((h>=0&&h<=24)? h : 0);
		min=((m>=0&&m<=60)?m:0);
		sec=((s>0&&s<=60)?s:0);
	}
	
	public TimeTest()
	{
		this(00,00,00);
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d",hour,min,sec);
	}
	
	public static void main(String args[]){
		
		TimeTest fir = new TimeTest();
		TimeTest sef = new TimeTest(4,12,44);
		TimeTest thi = new TimeTest(70,70,70);
		System.out.println("기본생성자 호출 후 시간:"+fir.toString());
		System.out.println("두번째생성자 호출 후 시간:"+sef.toString());
		System.out.println("올바르지 않은 시간 :"+thi.toString());		
	}
	
}//생성자 오버라이딩 예제
