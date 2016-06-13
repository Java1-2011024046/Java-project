package FinalTest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


abstract class subFrame extends JFrame implements ActionListener{
	public JRadioButton first,second,third;
	public JLabel seclabel;
	public JPanel sec1,sec2,sec3;
	public JFrame sub1,sub2,sub3;
	
	public subFrame(){
		this.setTitle("sub Frame1");
		this.setSize(750,250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		first=new JRadioButton("First");
		second=new JRadioButton("Second");
		third=new JRadioButton("Third");
		
		ButtonGroup size = new ButtonGroup();
		size.add(first);
		size.add(second);
		size.add(third);
		
		first.addActionListener(this);
		second.addActionListener(this);
		third.addActionListener(this);
		sec1.add(first);
		sec2.add(second);
		sec3.add(third);
		setVisible(true);
		
	}
	
}
class Final extends JFrame implements ActionListener{
	
	private JButton make1 , make2;
	private JTextField text;
	private JPanel topPanel,sizePanel,secondPanel, sec1,sec2,sec3;
	private JFrame suv,suv2;
	private JTextArea textArea;
	private JTextField textField;
	private JLabel laal;
	public JRadioButton first,second,third;
	
	public Final(){
		
		setTitle("Final-term");
		setSize(750,250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel=new JPanel();
		sizePanel = new JPanel();
		JLabel label=new JLabel("Final-Test");
		
		make1=new JButton("Make Frame1");
		make2=new JButton("Make Frame2");
		
		make1.addActionListener(this);
		make2.addActionListener(this);
		textField = new JTextField(30);
		textField.addActionListener(this);
		sizePanel.add(label);
		 textArea = new JTextArea(5,20);//텍스트영역을 생성하고
		 textArea.setEditable(false);
		
		JScrollPane scrollPane = new JScrollPane(textArea);//이게 스크롤 생성하는거.
	    add(scrollPane,BorderLayout.EAST);
		add(textArea,BorderLayout.EAST);
		 
		add(topPanel,BorderLayout.WEST);
		topPanel.add(make1);
		topPanel.add(make2);
		add(sizePanel,BorderLayout.CENTER);
		
		
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==make1){
			textArea.setText("make frame : 1");	
			suv = new JFrame("suv frame");
			suv.setSize(300, 200);
			suv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			suv.setVisible(true);
			
		}
		if(e.getSource()==make2){
			textArea.setText("make frame : 2");
			suv2 = new JFrame("suv frame2");
			suv2.setSize(300, 200);
			suv2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			first=new JRadioButton("First");
			second=new JRadioButton("Second");
			third=new JRadioButton("Third");
			
			ButtonGroup size = new ButtonGroup();
			size.add(first);
			size.add(second);
			size.add(third);
			
			first.addActionListener(this);
			second.addActionListener(this);
			third.addActionListener(this);
			sec1.add(first);
			sec2.add(second);
			sec3.add(third);
			suv2.setVisible(true);
		}
	}

	public static void main(String args[]){
	new Final() ;
	}
}