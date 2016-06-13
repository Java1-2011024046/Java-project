package final_practice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestField extends JFrame{

	private JButton button;
	private JTextField text,result;
	
	public TestField(){
		setSize(300,130);
		setTitle("�������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonListener listener = new ButtonListener();
		
		JPanel panel = new JPanel();
		panel.add(new JLabel("�����Է�"));
		text = new JTextField(15);
		text.addActionListener(listener);
		panel.add(text);
		
		panel.add(new JLabel("�����Ѱ�"));
		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		setVisible(true);

	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource()==button || e.getSource()==text){
				String name = text.getText();
				int value = Integer.parseInt(name);
				result.setText(" " + value*value);
				text.requestFocus();
			}
		}
	}
	public static void main(String arg[]){
		new TestField();
	}
}
