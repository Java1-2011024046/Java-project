package fin_chapter8;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame{
	
	public FrameTest3(){
	setSize(300,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("MYFRame");
	setVisible(true);
	
	setLayout(new FlowLayout());//���� ��ư �߰��ϴ� ���.
	JButton button=new JButton("��ư");
	this.add(button);
	setVisible(true);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameTest3 av = new FrameTest3();
	}
}
//����� 1,2,3 �� ���� �ִ� ���� �̹������ �ϸ� ���� ���� �ƴ� 2����������.


//������Ʈ���� ���� ���ѹ��� �����̳ʿ� ���Եȴ�. �ٸ������̳ʿ� ���ԵǾ� �ִµ� �Ǵٸ����������� ����.
//�ֻ��� �����̳ʿ��� �޴��ٸ� �߰��� ���ִ�.
//�ֻ��� �����̳� ���ο� ����Ʈ ���� (content pane)�� ������ �ִ�.���⿡ ������Ʈ�� �����Ѵ�.
//JFrame ���� Ŭ����(Frame,Window,Container,Component,Object)���� �����ϴ� �޼ҵ���� �ڽ� Ŭ���� ���� ��밡��
//add(component),setLocation(x,y),setSize(width,height),setIconImage(IconImage)
//setResizabla(boolean)-����ڰ� ũ�������Ǵ���