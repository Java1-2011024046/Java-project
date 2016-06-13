package finanl_chpater9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class MyFrame1 extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame1(){ //생성자로 객체 초기화 해주는것
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");
		
		JPanel panel =new JPanel();
		button =new JButton("버튼을 누르시오.");//버튼 생성
		label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		button.addActionListener(new MyListener());//버튼에 이벤트 리스너를 등록한다.그러면 버튼에 이벤트가 발생했을때
		// 리스너에 있는게 동작한다.
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
		
	}
	//내부클래스로 작성하니까 JFrame 에있는 label에도 접근할 수있어서 다양하게 쓸수 있다.
	private class MyListener implements ActionListener{//1.이벤트 리스너 클래스 작성.
		public void actionPerformed(ActionEvent e){
			if (e.getSource()==button)
			label.setText("마침내 버튼이 눌러졌습니다.");
		}
	}
	
}

public class ActionEventTest2 {
	public static void main(String args[]){
		MyFrame1 f=new MyFrame1();
	}
}