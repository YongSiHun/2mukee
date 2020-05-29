import java.awt.*;
import javax.swing.*;

class timer_runnable implements Runnable{
	JLabel la;
	
	public timer_runnable(JLabel la){
		this.la = la;
	}
	public void run(){
		int n=0;
		
		while(true){
			la.setText(Integer.toString(n));
			n++;
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}

public class yeze2 extends JFrame{
	yeze2(){
		Container c = new Container();
		c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel();
		la.setFont(new Font("Gothic",Font.ITALIC,80));
		timer_runnable ru = new timer_runnable(la);
		Thread th = new Thread(ru);
		c.add(la);
		
		this.setTitle("시간초 세기");
		this.setSize(300,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze2();
	}

}
