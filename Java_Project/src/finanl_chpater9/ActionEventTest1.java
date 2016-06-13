package finanl_chpater9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener{//1.�̺�Ʈ ������ Ŭ���� �ۼ�.
	public void actionPerformed(ActionEvent e){
		JButton button =(JButton) e.getSource();
		button.setText("��ħ�� ��ư�� ���������ϴ�.");
	}
}

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame(){ //�����ڷ� ��ü �ʱ�ȭ ���ִ°�
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		
		JPanel panel =new JPanel();
		button =new JButton("��ư�� �����ÿ�.");//��ư ����
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new MyListener());//��ư�� �̺�Ʈ �����ʸ� ����Ѵ�.�׷��� ��ư�� �̺�Ʈ�� �߻�������
		// �����ʿ� �ִ°� �����Ѵ�.
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
}

public class ActionEventTest1 {
	public static void main(String args[]){
		MyFrame f=new MyFrame();
	}
}