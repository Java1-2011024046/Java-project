package final_practice;
//����Ŭ���� �ܺ�Ŭ���� ����
public class Outerclass {

	private int ii=0;//Outerclass���� private�� ���������� ����Ŭ�������� ��밡���ϴ�.
	private int tttt=10;
	
	class Innerclass{
		public void meth(){//��� ����Ŭ������ ������:��ü �ʱ�ȭ���ִ°�/�޼ҵ�� �����ϴ�?
			System.out.println("�ܺ�Ŭ������ private���� ������ :"+ii);
		}		
	}
	Outerclass(){ //������. ��ü�� �����ɶ� �ʱ�ȭ�ϴ� Ư���� �޼ҵ� , Ŭ�����̸��̶� ���ƾ��Ѵ�.
		Innerclass obj = new Innerclass();
		obj.meth();
	}
	
	void display(){    //�޼ҵ�
		
		final String msg="Local class �ܺ�Ŭ���� ���� �� ���� ���� : ";//�������
		
		class local{
			void prtmsg(){
				System.out.println(msg+tttt);
			}
		}
		local aaa = new local(); //���� class������ ��ü����
		aaa.prtmsg();  //����class�޼ҵ�ȣ��
		
	}
	
	
	public static void main(String agrs[]){
		Outerclass bjbj= new Outerclass();
		bjbj.display();
	}
	
}
