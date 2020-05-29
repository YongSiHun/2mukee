import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

class doodle extends Thread{
	Container c;
	boolean flag=false;
	
	public doodle(Container c){
		this.c=c;
	}
	void finish(){
		flag=true;
	}
	public void run(){
		while(true){
			int x=(int)(Math.random()*c.getWidth());
			int y=(int)(Math.random()*c.getHeight());
			JLabel la = new JLabel("java");
			la.setSize(80,30);
			la.setLocation(x,y);
			c.add(la);
			c.repaint();
		try{
			Thread.sleep(300);
			if (flag==true){
				c.removeAll();
				JLabel ra=new JLabel("finish");
				ra.setSize(80,30);
				ra.setLocation(100,100);
				ra.setForeground(Color.RED);
				c.add(ra);
				c.repaint();
				return;
			}
		}
		catch(InterruptedException e){
			return;
			}
		}
		}
	}

public class yeze5 extends JFrame{
	doodle dle;
	yeze5(){
		Container c = new Container();
		c=getContentPane();
		c.setLayout(null);
		c.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				dle.finish();
			}
		});
		this.setTitle("flag thread");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dle = new doodle(c);
		dle.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze5();
	}

}
