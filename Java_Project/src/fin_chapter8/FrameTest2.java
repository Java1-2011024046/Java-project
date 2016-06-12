package fin_chapter8;
import javax.swing.*;
public class FrameTest2 extends JFrame{//JFrame 은 기본 컴포넌트 라서 그냥 상속이되는 듯.
	//JFrame을 상속받은 이 클래스에서 생성자를 통해 frame객체 초기화 시키면, main문장에서 객체 생성만해도된다.
	public FrameTest2(){
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MYFRame");
		setVisible(true);
	}
}
