package finanl_chpater9;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

class MyPanel extends JPanel{
	BufferedImage img = null;
	int img_x =0 , img_y=0;
	
	public MyPanel(){
		try{
			img = ImageIO.read(new File("car.gif"));
		}catch(IOException e){
			System.out.println("no Image");
			System.exit(1);
		}
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				img_x = e.getX();
				img_y = e.getY();
				repaint();
			}
		});
	}

public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.drawImage(img, img_x, img_y, null);
}
}
public class Adaptee {
	public static void main(String arg[]){
    MyPanel aa = new MyPanel();
}}
