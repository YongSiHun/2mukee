import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class yeze9 extends JFrame{
	yeze9(){
		board b = new board();
		this.add(b,BorderLayout.CENTER);
		this.setTitle("±×¸²ÆÇ");
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class board extends JPanel{
		Vector<Point>vs = new Vector<Point>();
		Vector<Point>ve = new Vector<Point>();
		
		Point startP = null;
		Point endP = null;
		
		public board(){
			this.setLayout(null);
			this.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e){
					startP = e.getPoint();
				}
				public void mouseReleased(MouseEvent e){
					endP = e.getPoint();
					vs.add(startP);
					ve.add(endP);
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for (int i=0;i<vs.size();i++){
				Point s = vs.elementAt(i);
				Point e = ve.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(), (int)e.getY());
			}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze9();
	}
}
