import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num9 extends JFrame{
	JLabel[] snake = new JLabel[10];
	moving mv;
	int j;
	num9(){
		this.setLayout(null);
		ImageIcon bg = new ImageIcon("images/bg.jpg");
		JLabel bgi = new JLabel(bg);
		bgi.setSize(this.getWidth(),this.getHeight());
		bgi.setLocation(0,0);
		this.add(bgi);
		
		for (int i=0;i<10;i++){
			if (i==0)
				snake[i]=new JLabel("◆");
			else{
				snake[i]=new JLabel("□");
				j=i-1;
			}
			snake[i].setLocation(i*10,50);
			snake[i].setSize(50,50);
			this.add(snake[i]);
			mv=new moving(snake[j],snake[i]);
			mv.start();
		}
		
		this.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				switch(e.getKeyCode()){
				case KeyEvent.VK_UP:
					snake[0].setLocation(snake[0].getX(),snake[0].getY()-5);
					break;
				case KeyEvent.VK_DOWN:
					snake[0].setLocation(snake[0].getX(),snake[0].getY()+5);
					break;
				case KeyEvent.VK_LEFT:
					snake[0].setLocation(snake[0].getX()-5,snake[0].getY());
					break;
				case KeyEvent.VK_RIGHT:
					snake[0].setLocation(snake[0].getX()+5,snake[0].getY());
					break;
				}
			}
		});
		this.setTitle("스네이크 움직이기 ");
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setFocusable(true);
	}
	public static void main(String[] args) {
		new num9();
	}
}

class moving extends Thread{
	JLabel head,front,back;
	
	moving(JLabel front,JLabel back){
		this.front=front;
		this.back=back;
	}

	public void run(){
		while(true){
			int fx=front.getX(),fy=front.getY();
			if (fx < back.getX())//f left
				back.setLocation(back.getX()-5,fy);
			else if (back.getX() < fx)//f right
				back.setLocation(back.getX()+5,fy);
			else if (fy < back.getY())//f up
				back.setLocation(fx,back.getY()-5);
			else if (back.getY() < fy)//f down
				back.setLocation(fx,back.getY()+5);
			try{
				sleep(200);
			}catch(InterruptedException e){
				return;
			}
		}
	}
}

