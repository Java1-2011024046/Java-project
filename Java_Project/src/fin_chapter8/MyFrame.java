package fin_chapter8;
//�����Ӱ� �гο� ������Ʈ�� ���̴� ������! 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	
	public MyFrame(){
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Pizza");
		//�׳� setLayout(new GridLayout(0,3))�ϸ� �����ӿ�����?����(�̰Ŵ� ��3�� ���� �����¸�ŭ�Ǵ°�) �����̳ʿ� ���ַ���
		//panel.setLayout(new BorderLayout())�Ѵ�.
		//button.setMaximumSize(new Dimension(300,200))-�ִ�ũ����Ʈ
		//button.setAlignmentX(Jcomponent.CENTER_ALIGNMENT) - �߾�������Ʈ
	
		JPanel Panel1=new JPanel();
		JPanel Panel2=new JPanel();
		JPanel Panel3=new JPanel();
		
		JLabel Label = new JLabel("���ڼ��迡 ���Ű� ȯ���մϴ�.���� ������ �����ϼ���");
		Panel1.add(Label);
		
		JButton button1=new JButton("�Ұ�� ����");
		//add(new JButton("�Ұ������");   �� ���� �� �ִ�.
		Panel2.add(button1);
		
		JButton button2=new JButton("ġ�� ����");
		Panel2.add(button2);
		
		JButton button3=new JButton("�������� ����");
		Panel2.add(button3);
		//�����ϴµ� ������ġ�� �����Ϸ���, setLayout(null)�ϰ��� 
		//�켱������Ʈ���� ���� �����̳ʿ� �߰��� ������ setbounds�� ũ��,��ġ ����
		//��ư b�� ������ٰ� �Ѵٸ� b.setBounds(x,t,w,h);�� ���Ѵ�.
		
		//*******�߿� pack()�ϸ� ���� ������Ʈ�� �� �����̳ʿ� add��-��. panel2.add(button1);�ʿ����.
		JLabel label2=new JLabel("����");
		JTextField text = new JTextField(10);//textfield���� ���̸� ����������.
		Panel2.add(label2);
		Panel2.add(text);
		
		
		Panel3.add(Panel1);
		Panel3.add(Panel2);
		add(Panel3);
		
		setVisible(true);
		
	}
	
	public static void main(String arg[]){
		MyFrame aa=new MyFrame();
	}
}

//��ġ ������! ������Ʈ���� ��� ��ġ�� ���� �����ϴ°ǵ� flowlayout ,borderlayout , gridlayout�ִ�
//flowlayout�� ������ �׳� �߹迭�Ǵ°Ű�, border�� ������������ �����Ѵ� Panel.add(compo,Borderlayout.north);
//Grid�� ���ڷ�, ��� ������Ʈ��簰��;���� �°�
