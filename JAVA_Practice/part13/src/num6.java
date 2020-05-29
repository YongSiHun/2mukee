import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num6 extends JFrame{
	num6(){
		
		this.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				JFrame fra = (JFrame)e.getSource();
				int x= e.getX();
				int y= e.getY();
				create bub = new create(fra,x,y);
				bub.start();
			}
		});
		this.setTitle("bubble");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num6();
	}
}

class create extends Thread{
	JFrame fra;
	int x,y;
	create(JFrame fra,int x,int y){
		this.fra = fra;
		this.x=x;
		this.y=y;
	}
	public void run(){
		ImageIcon icon = new ImageIcon("images/bubble.jpg");
		JLabel la = new JLabel(icon);
		la.setSize(30,30);
		la.setLocation(x,y);
		fra.add(la);
		while(true){
			y-=5;
			la.setLocation(x,y);
			if (y>300){
				interrupt();
			}
			try{
				sleep(20);
			}catch(InterruptedException e){
				return;
			}
		}
	}
	
}
