import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze6 extends JFrame{
	JLabel la = new JLabel("HELLO");
	JPanel pan = new JPanel();
	final int flyingunit = 10;
	
	yeze6(){
		this.setContentPane(pan);
		pan.setLayout(null);
		pan.addKeyListener(new moving());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		moving m = new moving();
		
		pan.add(la);
		this.setTitle("╩С го аб ©Л Hello Moving");
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan.requestFocus();
	}
	
	class moving extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int KeyCode = e.getKeyCode();
			switch(KeyCode){
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(),la.getY()-flyingunit);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(),la.getY()+flyingunit);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX()-flyingunit,la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX()+flyingunit,la.getY());
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze6();
	}

}
