import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num2 extends JFrame{
	JLabel la;
	timer time;
	num2(){
		la= new JLabel(Integer.toString(0));
		la.setFont(new Font("Gothic",Font.ITALIC,80));
		this.setLayout(new FlowLayout());
		time = new timer(la);
		la.requestFocus();
		
		la.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				if (time.isAlive()==true)
					time.interrupt();
				else{
					time = new timer(la);
					time.start();
				}
			}
		});
		this.add(la);
		this.setTitle("타이머 스레드 제어");
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num2();
	}
}
class timer extends Thread{
	JLabel la;
	int i=0;
	public timer(JLabel la){
		this.la=la;
	}
	public void run(){
		while(true){
			la.setText(Integer.toString(i));
			i++;
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				i=0;
				return;
			}
		}	
	}
}
