package fin_chapter8;

import javax.swing.*;
public class FrameTest1 {//이미 JFrame 은 기본 class,메소드로 정의되어있으니까 일반 class에서 따로 정의 안해줘도

	public static void main(String[] args) {//여기서 객체생성해서 각 성질들 해주면 된다.
		// TODO Auto-generated method stub
		JFrame f= new JFrame("Frame Test");
		
		f.setSize(300,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
