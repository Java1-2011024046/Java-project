package finanl_chpater9;
//�׼��̺�Ʈ�� ��ư������ �߻��ϴ°� �ƴϴ�.
//����ڰ� �޴� �׸��� �����Ҷ� , ��ưŬ��, �ؽ�Ʈ �ʵ忡�� ����Ű�� ������

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//�ΰ��� ��ư�� ���� �г��� �������� �����ϴ� ���α׷�!

class Frame extends JFrame{
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	
	MyListener listener = new MyListener();//������ ��ü�� �̸� ����� ���´�.
	
	public Frame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�гλ����� ������ �ۼ�");
		
		panel = new JPanel();
		button1 = new JButton("�����");
		button1.addActionListener(listener);
		panel.add(button1);
		button2 = new JButton("�ķ���");		
		button2.addActionListener(listener);
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{ //�� �ȵǴ��� �𸣰ڴ�.
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==button1){
				panel.setBackground(Color.YELLOW);
			}
			else if(e.getSource()==button2){
				panel.setBackground(Color.blue);
			}
		}
	}
}
	public class ActionEvent {
		public static void main(String args[]){
			Frame gg = new Frame();
		}
	}

