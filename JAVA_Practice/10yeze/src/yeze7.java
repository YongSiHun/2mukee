import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze7 extends JFrame{
	JPanel pane = new JPanel();
	JLabel la;
	
	yeze7(){
		this.setTitle("마우스 좌표와 위치");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pane);
		
		pane.addMouseListener(new moving());
		pane.addMouseMotionListener(new moving());
		
		la = new JLabel("No Mouse Event");
		pane.add(la);
		this.setSize(400,400);
		this.setVisible(true);
	}
	
	class moving implements MouseListener,MouseMotionListener{

		public void mousePressed(MouseEvent e) {
			la.setText("Mouse Pressed ("+e.getX()+","+e.getY()+")");
		}

		public void mouseReleased(MouseEvent e) {
			la.setText("Mouse Released ("+e.getX()+","+e.getY()+")");
		}
		
		public void mouseClicked(MouseEvent e){}

		public void mouseEntered(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.CYAN);
		}

		public void mouseExited(MouseEvent e) {
			JPanel p = (JPanel)e.getSource();
			p.setBackground(Color.YELLOW);
		}

		public void mouseDragged(MouseEvent e) {
			la.setText("Mouse Dragged ("+e.getX()+","+e.getY()+")");
		}

		public void mouseMoved(MouseEvent e) {
			la.setText("Mouse Moved ("+e.getX()+","+e.getY()+")");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze7();
	}

}
