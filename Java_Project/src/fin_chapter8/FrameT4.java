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
		Dimension screenSize=kit.getScreenSize();//����ȭ�� ũ�⸦ ��´�.
		
		setSize(300,200);
		setLocation(screenSize.width/2,screenSize.height/2);//������ ��ġ�� ����ȭ�� �߾������Ѵ�.
		
		
		Image img = kit.getImage("icon.gif");//�����ܺ��� �ϴ°� .
		setIconImage(img);
		setLayout(new FlowLayout());//�׳� setlayout�ϸ��� ������ ���̾ƿ��� ���Ѱǰ�?
		JButton button=new JButton("��ư");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setTitle("My Frame");
		this.add(button);
	}

	public static void main(String arg[]){
		FrameT4 ne = new FrameT4();
	}
}
//���� ������Ʈ JPanel - �����̳� �����ε� �����ӿ� �����ִ� ������Ʈ���� �ٷ� �����ӿ� ���̴°� ���� �гο� �ϴ°� ����
//, JLabel-�����Ұ��� �� �ؽ�Ʈ , 
//JTextfield  - JTextField , JFormattedTextField , JPasswordField, JCombobox,JSpinner
//, JButton - JButton,JCheckBox,JRadioButton,JMenuItem , JCheckBoxMenuItem,JRadioButtonMenuItem 