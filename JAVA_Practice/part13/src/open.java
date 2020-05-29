import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class open extends JFrame{
	JLabel aven,mon;
	int move=10;
	open(){
		aven = new JLabel("@");
		mon = new JLabel("M");
		aven.setSize(15,15);
		aven.setLocation(40,40);
		aven.setForeground(Color.RED);
		mon.setSize(15,15);
		mon.setLocation(100,40);
		game monster = new game(mon,aven);
		
		aven.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				char k = e.getKeyChar();
				if (k=='q')
					System.exit(0);	
				switch(e.getKeyCode()){
				case KeyEvent.VK_UP:
					aven.setLocation(aven.getX(),aven.getY()-move);
					break;
				case KeyEvent.VK_DOWN:
					aven.setLocation(aven.getX(),aven.getY()+move);
					break;
				case KeyEvent.VK_LEFT:
					aven.setLocation(aven.getX()-move,aven.getY());
					break;
				case KeyEvent.VK_RIGHT:
					aven.setLocation(aven.getX()+move,aven.getY());
					break;
				}
				aven.getParent().repaint();
			}
		});
		this.add(aven);
		this.add(mon);
		
		this.setLayout(null);
		this.setTitle("Monster");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		monster.start();
		aven.setFocusable(true);
	}

	public static void main(String[] args) {
		new open();
	}
}

class game extends Thread{
	JLabel mon,aven;
	game(JLabel mon, JLabel aven){
		this.mon = mon;
		this.aven = aven;
	}
	public void run(){
		int move=5,x=mon.getX(),y=mon.getY();
		while(true){
			if(aven.getX()<mon.getX())
				x=mon.getX()-move;
			else
				x=mon.getX()+move;
			if(aven.getY()<mon.getY())
				y=mon.getY()-move;
			else
				y=mon.getY()+move;
			mon.setLocation(x,y);
			
			int gapX = Math.abs(aven.getX()-mon.getX());
			int gapY = Math.abs(aven.getY()-mon.getY());
			
			if (gapX<10 && gapY<10){
				mon.setLocation(100,40);
				aven.setLocation(40,40);
			}
			
			try{
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}
