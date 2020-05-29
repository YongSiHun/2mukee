import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze3 extends JFrame{
	yeze3(){
		board b = new board();
		this.add(b);
		
		this.setTitle("Color and Font");
		this.setSize(350,450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class board extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawString("MAD MAX", 30, 30);
			g.setColor(new Color(255,0,0));
			g.setFont(new Font("Arial",Font.ITALIC,30));
			g.drawString("Let's go ahead", 30, 60);
			g.setColor(new Color(0x00ff00ff));
			for (int i=0;i<=5;i++) {
				g.setFont(new Font("Jokerman",Font.ITALIC,i*10));
				g.drawString("Let's win!",30,60+60*i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze3();
	}
}