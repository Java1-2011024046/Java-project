package fin_chapter8;

public interface RemoteControl {
	public void turnOn();//�������̽��� �߻� Ŭ������ �����ϴ�.�ȿ� ����Ǵ� �޼ҵ�鵵 �߻�޼ҵ��ε� abstract������
	public void turnOff();
}

class Television implements RemoteControl{//�������̽��޴� �Ŵ� �̷��� ǥ���Ѵ�.
	boolean onoff=false;
	public void turnOn(){
		onoff=true;//Tv������ Ű�� ���� �ڵ尡 ����.
	}
	
	public void turnOff(){
		onoff=false;//Tv������ ���� ���� �ڵ尡 ����.
	}
	
}
//�������̽��� �߻�Ŭ���� ����
//�߻�Ŭ������ ���� Ŭ������ ���̿� �ڵ带 �����ϰ� �ʹٸ� �߻�Ŭ����, �����ʵ峪 �޼ҵ���� ������,public�̿��� ���������ڸ� ����ؾ��ϴ°��.
//�����ʵ峪 ����� �ƴ� �ʵ带 �����ϱ⸦ ���Ҷ�.
//�������̽��� ���þ��� Ŭ�������� �������̽��� �����ϱ⸦ ���Ҷ�,Ư���ڷ����� ������ �����ϰ� ������ ���������ϴ��� ������Ҷ�,*���߻���� �ʿ��ҋ�