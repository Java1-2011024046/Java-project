package fin_chapter8;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameT4 extends JFrame{
	
	public FrameT4(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();//현재화면 크기를 얻는다.
		
		setSize(300,200);
		setLocation(screenSize.width/2,screenSize.height/2);//프레임 위치를 현재화면 중앙으로한다.
		
		
		Image img = kit.getImage("icon.gif");//아이콘변경 하는거 .
		setIconImage(img);
		setLayout(new FlowLayout());//그냥 setlayout하면은 프레임 레이아웃에 관한건가?
		JButton button=new JButton("버튼");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("My Frame");
		this.add(button);
	}

	public static void main(String arg[]){
		FrameT4 ne = new FrameT4();
	}
}
//기초 컴포넌트 JPanel - 컨테이너 일종인데 프레임에 들어갈수있다 컴포넌트들을 바로 프레임에 붙이는거 보다 패널에 하는게 좋다
//, JLabel-편집불가능 한 텍스트 , 
//JTextfield  - JTextField , JFormattedTextField , JPasswordField, JCombobox,JSpinner
//, JButton - JButton,JCheckBox,JRadioButton,JMenuItem , JCheckBoxMenuItem,JRadioButtonMenuItem 