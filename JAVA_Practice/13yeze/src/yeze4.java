import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class timer implements Runnable{
	JLabel la;
	public timer(JLabel la){
		this.la=la;
	}
	public void run() {
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


public class yeze4 extends JFrame{
	public yeze4(){
		Container c = new Container();
		c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel la = new JLabel("");
		la.setFont(new Font("Gothic",Font.ITALIC,80));
		
		timer tr = new timer(la);
		Thread th = new Thread(tr);		
		c.add(la);
		
		JButton btn = new JButton("STOP");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				JButton btn=(JButton)e.getSource();
				btn.setEnabled(false);
			}
		});
		c.add(btn);
		
		this.setTitle("스레드 중지");
		this.setSize(300,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze4();
	}
}
