import java.awt.*;
import java.util.Calendar;
import javax.swing.*;

public class num3 extends JFrame{
	num3(){
		JLabel la = new JLabel("");
		la.setFont(new Font("Gothic",Font.ITALIC,80));
		timeman tm = new timeman(la);
		this.setLayout(new FlowLayout());
		this.add(la);
		
		this.setTitle("Digital Clock");
		this.setSize(400,250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tm.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num3();
	}
}

class timeman extends Thread{
	int hour,min,sec;
	JLabel la;
	public timeman(JLabel la){
		this.la=la;
	}
	public void run(){
		while(true){
			Calendar c = Calendar.getInstance();
			hour = c.get(Calendar.HOUR_OF_DAY);
			min = c.get(Calendar.MINUTE);
			sec = c.get(Calendar.SECOND);
			String clockText = Integer.toString(hour);
			clockText = clockText.concat(":"+Integer.toString(min));
			clockText = clockText.concat(":"+Integer.toString(sec));
			la.setText(clockText);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}
