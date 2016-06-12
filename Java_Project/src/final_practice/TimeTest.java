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
		System.out.println("�⺻������ ȣ�� �� �ð�:"+fir.toString());
		System.out.println("�ι�°������ ȣ�� �� �ð�:"+sef.toString());
		System.out.println("�ùٸ��� ���� �ð� :"+thi.toString());		
	}
	
}//������ �������̵� ����
