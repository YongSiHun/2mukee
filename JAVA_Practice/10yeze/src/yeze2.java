import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze2 extends JFrame{
	JLabel l;
	
	yeze2(){
		JPanel p = new JPanel();
		setContentPane(p);
		setLayout(null);
		p.addMouseListener(new mseve());
		
		l = new JLabel("Follow you!");
		l.setSize(50,20);
		l.setLocation(30,30);
		p.add(l);
		
		this.setTitle("Following Mouse");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	class mseve implements MouseListener{
		public void mousePressed(MouseEvent e){
			int x=e.getX();
			int y=e.getY();
			l.setLocation(x,y);
			}
		public void mouseReleased(MouseEvent e){}
		public void mouseClicked(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
		public void mouseExited(MouseEvent e){}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze2();
	}

}
