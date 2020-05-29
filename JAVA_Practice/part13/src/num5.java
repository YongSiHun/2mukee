import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num5 extends JFrame{
	num5(){
		this.setTitle("´ßÀâ±â °ÔÀÓ");
		this.setSize(300,300);
		this.setLayout(null);
		
		ImageIcon chicken_icon=new ImageIcon("images/chicken.jpg");
		JLabel chi = new JLabel(chicken_icon);
		JLabel bullet = new JLabel();
		JLabel gun = new JLabel();
		
		chi.setSize(chicken_icon.getIconWidth(),chicken_icon.getIconHeight());
		chi.setLocation(0,0);
		
		bullet.setSize(10,10);
		bullet.setOpaque(true);
		bullet.setBackground(Color.RED);
		bullet.setLocation(this.getWidth()/2-5,this.getHeight()-90);
		
		gun.setSize(40,40);
		gun.setOpaque(true);
		gun.setBackground(Color.BLACK);
		gun.setLocation(this.getWidth()/2-25,this.getHeight()-80);
		
		target_thread tar = new target_thread(chi);
		
		this.addKeyListener(new KeyAdapter(){
			bullet_thread bul;
			public void keyPressed(KeyEvent e){
				if (e.getKeyChar() == '\n'){
					bul = new bullet_thread(bullet,chi,tar);
					bul.start();
				}
			}
		});
		
		this.add(bullet);
		this.add(chi);
		this.add(gun);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tar.start();
		this.setFocusable(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num5();
	}
}

class target_thread extends Thread{
	JLabel target;
	target_thread(JLabel target){
		this.target = target;
	}
	public void run(){
		int x=target.getX();
		int y=target.getY();
		while(true){
			if (x>300){
				x=0;
			}
			else{
				x+=5;
				target.setLocation(x,y);
			}
			try{
				Thread.sleep(20);
			}
			catch(InterruptedException e){
				target.setLocation(0, 0);
				try{
					sleep(500);
				}
				catch(InterruptedException e2){	
					System.out.println("rlahEl");
					return;
				}
			}
		}
	}
}

class bullet_thread extends Thread{
	JComponent bull;
	JComponent tar;
	Thread target_thread;
	bullet_thread(JComponent bull,JComponent tar,Thread target_thread){
		this.bull=bull;
		this.tar=tar;
		this.target_thread = target_thread;
	}
	public void run(){
		int x=bull.getX();
		int y=bull.getY();
		while(true){
			if (y<-10){
				y=205;
				bull.setLocation(x,y);
				this.interrupt();
			}
			else{
				y-=5;
				bull.setLocation(x,y);
				if((x>=tar.getX() && x<=tar.getX()+40) && y<=300-tar.getY()){
					target_thread.interrupt();
				}
			}
			
			try{
				Thread.sleep(20);
			}
			catch(InterruptedException e){
				return;
			}

		}
	}
}
