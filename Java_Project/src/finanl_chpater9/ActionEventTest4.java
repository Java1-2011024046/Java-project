package finanl_chpater9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame4 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame4(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("����Ŭ������ ������Ŭ���� ����");
		
		JPanel panel = new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label=new JLabel("���� ��ư�� ������ �ʾҽ��ϴ�");
		
		//����Ŭ������ ����ϴ� ����ó��, �굵 �ѹ��� ����ϱ� ���ؼ� �ۼ��ȴ�.
		button.addActionListener(new ActionListener(){//���� Ŭ���� �ȿ��� ��ü�� ���ÿ� �����ȴ�.
			//ActionListener�������̽��� �����Ѵ�.
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==button){
					label.setText("��ư�� ���������ϴ�");		
				}
			}
		});
			panel.add(button);
			panel.add(label);
			
			this.add(panel);
			this.setVisible(true);
	}
}

public class ActionEventTest4 {
	public static void main(String args[]){
		MyFrame4 bb= new MyFrame4();
	}
}
