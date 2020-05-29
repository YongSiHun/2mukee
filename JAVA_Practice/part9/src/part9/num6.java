package part9;
import java.awt.*;
import javax.swing.*;

public class num6 extends JFrame{
	num6(){
		Container c = getContentPane();
		c.setLayout(null);
		
		for (int i =1;i<=20;i++)
		{
			JLabel l = new JLabel();
			l.setBackground(Color.BLUE);
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
			l.setLocation(x,y);
			l.setSize(10,10);
			l.setOpaque(true);
			c.add(l);
		}
		this.setTitle("Randm Labels");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num6();
	}

}
