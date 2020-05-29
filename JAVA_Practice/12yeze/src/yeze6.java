import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze6 extends JFrame{
	yeze6(){
		board b = new board();
		this.add(b,BorderLayout.CENTER);		
		this.setTitle("image drawing");
		this.setSize(500,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class board extends JPanel{
		ImageIcon icon = new ImageIcon("images/image0.jpg");
		Image image = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze6();
	}

}
