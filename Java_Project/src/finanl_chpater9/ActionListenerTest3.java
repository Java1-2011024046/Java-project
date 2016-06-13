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
		this.setTitle("이번트 예제");
		
		JPanel panel=new JPanel();
		button=new JButton("버튼을 누르시오");
		label =  new JLabel("아직 안눌렸슴");
		//컴포넌트들 추가할때 ,방법이 3가지로 확인된다 
		//1번째, JButton aa = new JButton("");
		//2번째 , b1 = new JButton("버튼방법");
		//3번째, add=(new JButton("버튼 방법3"); 근데 이거는 지정이 안되있어서 특수할때만?쓰는거같음

		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);				
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==button){
			label.setText("마침내 버튼이 눌러졌습니다");		
		}
	}
}

public class ActionListenerTest3 {

	public static void main(String args[]){
		MyFrame3 gg=new MyFrame3();
	}
}
