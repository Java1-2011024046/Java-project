package ex5_30;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	
	public MyFrame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("�̺�Ʈ ����");
		JPanel panel= new JPanel();
		button=new JButton("��ư�� �����ÿ�.");
		label =new JLabel("���� ���v�� �������� �ʾҽ��ϴ�.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button){
				button.setText("��ħ�� ��������~~~~~");
			}
			}
		});
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
}
}
	


