package finanl_chpater9;
//마우스 리스너인터페이스  mouseClicked(MouseEvent e)
//mouseEntered(MouseEvent e) 커서가 들어가면
//mouseExited( 위와동일)커서가 나가면
//mousePressed()눌러지면
//mouseReleased()떼어지면
//마우스 모션 리스너 인터페이스
//mouseDragged()드래그할떄
//mouseMoved()클릭되지않고 이동
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

//마우스로 그림그리기
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
		setTitle("마우스로 그림 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Mypanel());
		setVisible(true);
	}
public static void main(String args[]){
	Scribble s=new Scribble();
}
}
