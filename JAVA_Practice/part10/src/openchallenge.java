import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class openchallenge extends JFrame{
	JPanel GamePane1 = new JPanel();
	JLabel []la = new JLabel[3];
	JLabel la0 = new JLabel("시작합니다");
	
	openchallenge(){
		int i=0;
		this.setContentPane(GamePane1);
		
		GamePane1.setLayout(null);
		GamePane1.addKeyListener(new key());
		
		for (i=0;i<3;i++)
		{
			la[i]=new JLabel(" ");
			la[i].setLocation(100*(i+2),100);
			la[i].setSize(50,100);
			la[i].setBackground(Color.YELLOW);
			la[i].setOpaque(true);
			GamePane1.add(la[i]);
		}
		la0.setBounds(300,250,80,80);
		GamePane1.add(la0);
		
		this.setTitle("Open Challenge 10");
		this.setSize(700,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePane1.requestFocus();
	}
	
	class key extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			if (e.getKeyChar() == '\n'){
				int []ran = new int[3];
				for (int i=0;i<3;i++)
				{
					ran[i]=(int)(Math.random()*5);
					la[i].setText(" "+ran[i]);
				}
				if (ran[0]==ran[1]&&ran[1]==ran[2]&&ran[0]==ran[2])
					la0.setText("축하합니다!");
				else
					la0.setText("아쉽군요");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new openchallenge();
	}

}
