package fin_chapter8;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame{
	
	public FrameTest3(){
	setSize(300,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("MYFRame");
	setVisible(true);
	
	setLayout(new FlowLayout());//여긴 버튼 추가하는 방법.
	JButton button=new JButton("버튼");
	this.add(button);
	setVisible(true);
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FrameTest3 av = new FrameTest3();
	}
}
//방법이 1,2,3 세 가지 있다 지금 이방법으로 하면 가장 좋고 아님 2번으로하자.


//컴포넌트들은 각각 딱한번만 컨테이너에 포함된다. 다른컨테이너에 포함되어 있는데 또다른곳에넣을수 없다.
//최상위 컨테이너에는 메뉴바를 추가할 수있다.
//최상위 컨테이너 내부에 콘텐트 페인 (content pane)을 가지고 있다.여기에 컴포넌트를 저장한다.
//JFrame 조상 클래스(Frame,Window,Container,Component,Object)에서 제공하는 메소드들은 자식 클래스 들이 사용가능
//add(component),setLocation(x,y),setSize(width,height),setIconImage(IconImage)
//setResizabla(boolean)-사용자가 크기조절되는지