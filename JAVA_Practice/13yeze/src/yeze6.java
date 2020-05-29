import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class bar extends JLabel{
	int bar_size=0;
	int maxbar_size;
	
	bar(int maxbar_size){
		this.maxbar_size=maxbar_size;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))/maxbar_size*bar_size);
		if (width ==0)
			return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	synchronized void fill(){
		if (bar_size == maxbar_size){
			try{
				wait();
			}
			catch(InterruptedException e){
				return;
				}
			}
		bar_size++;
		repaint();
		notify();
		}
	synchronized void consume(){
		if (bar_size == 0){
			try{
				wait();
			}catch(InterruptedException e){
				return;
			}
		}
		bar_size--;
		repaint();
		notify();
	}
}

class consumer_thread extends Thread{
	bar bar;
	consumer_thread(bar bar){
		this.bar = bar;
	}
	public void run(){
		while(true){
			try{
				sleep(200);
				bar.consume();
			}catch(InterruptedException e){
				return;
			}
		}
	}
}

public class yeze6 extends JFrame{
	bar bar = new bar(100);
	yeze6(String Title){
		super(Title);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.ORANGE);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				bar.fill();
			}
		});
		this.setTitle("bar tender");
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.requestFocus();
		consumer_thread th = new consumer_thread(bar);
		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze6("bar filling");
	}

}
