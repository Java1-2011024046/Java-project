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
		this.setTitle("무명클래스로 리스너클래슷 예제");
		
		JPanel panel = new JPanel();
		button=new JButton("버튼을 누르시오");
		label=new JLabel("아직 버튼이 눌리지 않았습니다");
		
		//무명클래스를 사용하는 이유처럼, 얘도 한번만 사용하기 위해서 작성된다.
		button.addActionListener(new ActionListener(){//무명 클래스 안에서 객체도 동시에 생성된다.
			//ActionListener인터페이스도 구현한다.
			public void actionPerformed(ActionEvent e){
				if(e.getSource()==button){
					label.setText("버튼이 눌러졌습니다");		
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
