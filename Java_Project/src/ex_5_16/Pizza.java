package ex_5_16;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza extends JFrame {
	
	public Pizza(){
	setSize(500,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("MyFrame");
	
	JPanel panel=new JPanel();
	JPanel panel1=new JPanel();
	JPanel panel2=new JPanel();
	
	JLabel label=new JLabel("자바 피자에 오신 것을 환영합니다.");
	
	panel1.add(label);
	
	JButton button1=new JButton("콤포피자");
	JButton button2=new JButton("포테이토피자");
	JButton button3=new JButton("불고기피자");
	panel2.add(button1);
	panel2.add(button2);
	panel2.add(button3);
	
	JLabel label2=new JLabel("개수");
	JTextField field1=new JTextField(10);
	panel2.add(label2);
	panel2.add(field1);
	
	panel.add(panel1);
	panel.add(panel2);
	add(panel);
	setVisible(true);
	
	
	}
}
