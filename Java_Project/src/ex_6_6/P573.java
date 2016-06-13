package ex_6_6;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class P573 extends JFrame implements ActionListener {
	 protected JTextField textField;
	 protected JTextArea textArea;
	 
	 public P573(){
		 setTitle("Text Area Test");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 textField = new JTextField(30);
		 textField.addActionListener(this);
		 
		 textArea = new JTextArea(15,30);//�ؽ�Ʈ������ �����ϰ�
		 textArea.setEditable(false);
		
		 JScrollPane scrollPane = new JScrollPane(textArea);//�̰� ��ũ�� �����ϴ°�.
	     add(scrollPane,BorderLayout.CENTER);
		 add(textField,BorderLayout.NORTH);
		 //add(textArea,BorderLayout.CENTER); scollpane�� textArea�� �پ��ֱ⶧���� �긦 �ι� �ϸ� �ȵȴ�.
		 
		 pack();
		 setVisible(true);
		 
	 }
	 
	 public void actionPerformed(ActionEvent evt){
		 String text = textField.getText();
		 textArea.append(text + "\n");
		 textField.selectAll();
		 textArea.setCaretPosition(textArea.getDocument().getLength());
	 }

	 public static void main(String[] args){
		 new P573();
	 }
}
