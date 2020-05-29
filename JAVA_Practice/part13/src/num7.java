import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num7 extends JFrame{
	start game;
	
	num7(){
		JLabel la = new JLabel("1");
		JButton btn = new JButton("Start");
		game = new start(la,btn);

		la.setBackground(Color.ORANGE);
		la.setOpaque(true);
		la.setFont(new Font("Gothic",Font.ITALIC,40));
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				btn.setEnabled(false);
				if (game.isAlive()==false){
					game = new start(la,btn);
				}
				game.start();
			}			
		});
		
		la.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				int num = Integer.parseInt(la.getText());
				int single = num%10;
				int dual = num/10; 
				int ctt = e.getClickCount();
				if (ctt==2)
					game.setSw(2);
				else if (ctt==1)
					game.setSw(1);
				
				if (((single==3||single==6||single==9)||(dual==3||dual==6||dual==9))==false){
					game.interrupt();
					la.setText("Fail");
				}
			}
		});
		
		this.setLayout(new GridLayout(2,3));
		this.add(la);
		this.add(btn);
		this.setTitle("369 game");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		la.requestFocus();
		btn.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num7();
	}
}

class start extends Thread{
	JLabel la;
	JButton btn;
	int sw=0;
	
	start(JLabel la,JButton btn){
		this.la=la;
		this.btn=btn;
	}
	
	void setSw(int n){
		this.sw=n;
	}
	
	public void run(){
		int n=40;
		
		while(true){
			int single = n%10;
			int dual = n/10; 
			la.setText(Integer.toString(n));
			n+=1;
			
			if (n==99){
				la.setText("Win!!");
				this.interrupt();
			}
			
			try{
				sleep(700);
				if (((single==3||single==6||single==9)||(dual==3||dual==6||dual==9)) && sw==0)
					this.interrupt();
				if (((single==3||single==6||single==9)&&(dual==3||dual==6||dual==9)) && sw!=2){
					sw=3;
					this.interrupt();
				}
				else if ((single==3||single==6||single==9)||(dual==3||dual==6||dual==9)==false)
					sw=0;
			}
			catch(InterruptedException e){
				if (sw==0)
					la.setText("fail^");
				else if (sw==3)
					la.setText("fail^^");
				btn.setEnabled(true);
				return;
			}
		}
	}
}