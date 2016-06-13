package finanl_chpater9;
//액션이벤트는 버튼에서만 발생하는게 아니다.
//사용자가 메뉴 항목을 선택할때 , 버튼클릭, 텍스트 필드에서 엔터키를 누를때

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//두개의 버튼을 만들어서 패널의 배경색깔을 변경하는 프로그램!

class Frame extends JFrame{
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	
	MyListener listener = new MyListener();//리스너 객체를 미리 만들어 놓는다.
	
	public Frame(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("패널색변경 리스너 작성");
		
		panel = new JPanel();
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		button2 = new JButton("파런색");		
		button2.addActionListener(listener);
		panel.add(button2);
		
		this.add(panel);
		this.setVisible(true);
	}
	
	private class MyListener implements ActionListener{ //왜 안되는지 모르겠다.
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

