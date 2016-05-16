package ex_5_16;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Myframe extends JFrame {

		public Myframe(){
			Toolkit kit=Toolkit.getDefaultToolkit();
			Dimension screenSize=kit.getScreenSize();
			setSize(300,200);
			setLocation(screenSize.width/2,screenSize.height/2);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("MyFrame");
			setLayout(new FlowLayout());
			JButton button=new JButton("¹öÆ°");
			this.add(button);
			setVisible(true);
			
			
		}
}
