package ex5_30;

import javax.swing.*;
import java.awt.event.*;

class MyListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		
		JButton button=(JButton) e.getSource();
		button.setText("마침내 버튼이 눌러졌습니다.");
	}

}

