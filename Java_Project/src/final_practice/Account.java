package final_practice;

public class Account {
	private int regnumber;
	private String name;
	private int balance;
	
	public String getName(){ return name;}
	public void setName(String name){ this.name = name;}
	public int getBalance(){return balance;}
	public void setBalance(int balance){this.balance = balance;}
	
	public static void main(String[] args){
		Account obj = new Account();
		
		obj.setName("Tom");
		obj.setBalance(1000);
		System.out.println("�̸���"+obj.getName()+"�ܰ���"+obj.getBalance());
		
		
	}
}
//�����ڿ� ������ ����