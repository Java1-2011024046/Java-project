//������ �޼ҵ�,�����ε� ����.
package final_practice;

public class Date {

	private int year;
	private String month;
	private int day;
	
	public Date(int year,String month,int day){
		this.year=year;
		this.month=month;
		this.day=day;
	}
	public Date(int year)
	{
		this(year,"1��",1);
	}
	public Date()
	{
		this(1998,"2��",11);
	}
	
	public String toString()
	{
		return "Date [year=" +year+",month="+month+",day="+day+"]";
	}
	
	public static void main(String args[]){
		Date date1 = new Date(2015,"8��",10);
		Date date2 = new Date(2000);
		Date date3 = new Date();
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
	
	}
}//������ �޼ҵ�,�����ε� ����.
