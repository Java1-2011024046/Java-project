package fin_chapter8;
//프레임과 패널에 컴포넌트들 붙이는 연습들! 
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
		//그냥 setLayout(new GridLayout(0,3))하면 프레임에관해?서고(이거는 열3개 행은 나오는만큼되는거) 컨테이너에 해주려면
		//panel.setLayout(new BorderLayout())한다.
		//button.setMaximumSize(new Dimension(300,200))-최대크기힌트
		//button.setAlignmentX(Jcomponent.CENTER_ALIGNMENT) - 중앙정렬힌트
	
		JPanel Panel1=new JPanel();
		JPanel Panel2=new JPanel();
		JPanel Panel3=new JPanel();
		
		JLabel Label = new JLabel("피자세계에 오신걸 환영합니다.피자 종류를 선택하세요");
		Panel1.add(Label);
		
		JButton button1=new JButton("불고기 피자");
		//add(new JButton("불고기피자");   로 만들 수 있다.
		Panel2.add(button1);
		
		JButton button2=new JButton("치즈 피자");
		Panel2.add(button2);
		
		JButton button3=new JButton("포테이토 피자");
		Panel2.add(button3);
		//정렬하는데 절대위치로 정렬하려면, setLayout(null)하고나서 
		//우선컴포넌트들을 만들어서 컨테이너에 추가한 다음에 setbounds로 크기,위치 조정
		//버튼 b를 만들었다고 한다면 b.setBounds(x,t,w,h);로 정한다.
		
		//*******중요 pack()하면 만든 컴포넌트들 다 컨테이너에 add된-다. panel2.add(button1);필요없이.
		JLabel label2=new JLabel("개수");
		JTextField text = new JTextField(10);//textfield에는 길이를 지정해주자.
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

//배치 관리자! 컴포넌트들을 어디에 배치할 건지 지정하는건데 flowlayout ,borderlayout , gridlayout있다
//flowlayout은 옆으로 그냥 쭉배열되는거고, border는 동서남북으로 지정한다 Panel.add(compo,Borderlayout.north);
//Grid는 격자로, 모든 컴포넌트모양같음;딱딱 맞게
