import java.awt.*;
import javax.swing.*;

class timer_thread extends Thread{
	JLabel la;
	
	public timer_thread(JLabel la){
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

public class yeze1 extends JFrame{
	yeze1(){
		Container c = new Container();
		c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel();
		la.setFont(new Font("Gothic",Font.ITALIC,80));
		timer_thread th = new timer_thread(la);
		c.add(la);
		
		this.setTitle("�ð��� ����");
		this.setSize(300,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze1();
	}

}
