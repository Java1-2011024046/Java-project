package finanl_chpater9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame3 extends JFrame implements ActionListener{
	
	private JButton button;
	private JLabel label;
	
	public MyFrame3(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̹�Ʈ ����");
		
		JPanel panel=new JPanel();
		button=new JButton("��ư�� �����ÿ�");
		label =  new JLabel("���� �ȴ��Ƚ�");
		//������Ʈ�� �߰��Ҷ� ,����� 3������ Ȯ�εȴ� 
		//1��°, JButton aa = new JButton("");
		//2��° , b1 = new JButton("��ư���");
		//3��°, add=(new JButton("��ư ���3"); �ٵ� �̰Ŵ� ������ �ȵ��־ Ư���Ҷ���?���°Ű���

		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);				
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){
			label.setText("��ħ�� ��ư�� ���������ϴ�");		
		}
	}
}

public class ActionListenerTest3 {

	public static void main(String args[]){
		MyFrame3 gg=new MyFrame3();
	}
}