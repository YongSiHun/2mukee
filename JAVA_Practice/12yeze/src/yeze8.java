import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze8 extends JFrame{
	yeze8(){
		board b = new board();
		this.add(b,BorderLayout.CENTER);		
		this.setTitle("image drawing cliping");
		this.setSize(300,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class board extends JPanel{
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image image = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setClip(50,20,150,150);
			g.drawImage(image,this.getWidth(),this.getHeight(),this);
			g.setColor(Color.BLUE);
			g.setFont(new Font("SanSerif",Font.ITALIC,40));
			g.drawString("Last exam 4.0",10,150);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze8();
	}

}
