package finanl_chpater9;
//���콺 �������������̽�  mouseClicked(MouseEvent e)
//mouseEntered(MouseEvent e) Ŀ���� ����
//mouseExited( ���͵���)Ŀ���� ������
//mousePressed()��������
//mouseReleased()��������
//���콺 ��� ������ �������̽�
//mouseDragged()�巡���ҋ�
//mouseMoved()Ŭ�������ʰ� �̵�
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//���콺�� �׸��׸���
class point {
	int x,y;
}
class MyPanel extends JPanel implements MouseMotionListener{
	private int index =0;
	point[] array = new point[1000];
	
	public MyPanel(){
		this.addMouseMotionListener(this);
	}
	//override
	public void mouseDragged(MouseEvent e){
		int x = e.getX();
		int y = e.getY();
		if(index>1000)
			return;
		array[index]=new point();
		array[index].x=e.getX();
		array[index].y=e.getY();
		index++;
		repaint();
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for (point p : array)
			if(p !=null)
				g.drawRect(p.x, p.y, 1, 1);
		}
	//override
	public void mouseMoved(MouseEvent args){		
	}
}

public class Scribble extends JFrame{
	public Scribble(){
		setSize(300,300);
		setTitle("���콺�� �׸� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Mypanel());
		setVisible(true);
	}
public static void main(String args[]){
	Scribble s=new Scribble();
}
}
