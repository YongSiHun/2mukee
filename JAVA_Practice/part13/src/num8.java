import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num8 extends JFrame{
	la_thread la1s;
	la_thread la2s;
	int sw=0;
	int flag=0;
	num8(){
		JLabel name1 = new JLabel("기성용 키 AS");
		JLabel name2 = new JLabel("용성기 키 KL");
		JLabel la1 = new JLabel(" ");
		JLabel la2 = new JLabel(" ");
		JButton btn = new JButton("Start");
		
		la1.setBackground(Color.ORANGE);
		la1.setOpaque(true);
		la1.setFont(new Font("Gothic",Font.ITALIC,30));
		la2.setBackground(Color.ORANGE);
		la2.setOpaque(true);
		la2.setFont(new Font("Gothic",Font.ITALIC,30));
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				la1s = new la_thread(la1,btn);
				la2s = new la_thread(la2,btn);
				la1s.start();
				la2s.start();
			}
		});
		
		la1.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e1) {
				char keyb = e1.getKeyChar();
				int num = Integer.parseInt(la1.getText());
				int single = num%10;
				int dual = num/10; 
				
				if (keyb=='a')
					la1s.setsw(1);
				else if (keyb=='s')
					la1s.setsw(2);
				if (((single==3||single==6||single==9)||(dual==3||dual==6||dual==9))==false){
					la2s.seti(99);
					la1s.interrupt();
				}
			}
		});
		
		la2.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e1) {
				char keyb = e1.getKeyChar();
				int num = Integer.parseInt(la1.getText());
				int single = num%10;
				int dual = num/10; 
				
				if (keyb=='k')
					la2s.setsw(1);
				else if (keyb=='l')
					la2s.setsw(2);
				if (((single==3||single==6||single==9)||(dual==3||dual==6||dual==9))==false){
					la1s.seti(99);
					la2s.interrupt();
				}
			}
		});
		
		this.setLayout(new GridLayout(3,2));
		this.add(name1);
		this.add(name2);
		this.add(la1);
		this.add(la2);
		this.add(btn);
		
		this.setTitle("369 game multiplay");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		la1.setFocusable(true);
		la2.setFocusable(true);
		
	}
	
	public static void main(String[] args) {
		new num8();
	}
}

class la_thread extends Thread{
	JLabel la;
	JButton btn;
	num8 nu;
	int sw=0,i=1;
	int flag=0;
	
	la_thread(JLabel la,JButton btn){
		this.la = la;
		this.btn = btn;
	}
	void setsw(int m){
		this.sw=m;
	}
	synchronized void seti(int n){
		this.i=n;
	}
	public void run(){
		while(true){
			int single = i%10;
			int dual = i/10; 
			la.setText(Integer.toString(i));
			i++;

			if (i==99){
				la.setText("Win!!");
				this.interrupt();
			}
			try{
				sleep(700);
				
				if (sw==0 && ((single==3||single==6||single==9)||(dual==3||dual==6||dual==9)))//a나 s를 안누르면 
					this.interrupt();
				else if ((single!=3&&single!=6&&single!=9)&&(dual==3||dual==6||dual==9))
					sw=0;
				if (((single==3||single==6||single==9)&&(dual==3||dual==6||dual==9))&&sw!=2)
					this.interrupt();
				else if ((single==3||single==6||single==9)||(dual==3||dual==6||dual==9)==false)//sw를 다시 0으로
					sw=0;
			}
			catch(InterruptedException e){
				if (i==99)
					la.setText("win!!");
				else
					la.setText("Fail");
				btn.setEnabled(true);
				return;
			}
		}
	}
}


