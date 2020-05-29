package part9;
import java.awt.*;
import javax.swing.*;

public class num2 extends JFrame{
	num2(){
		Container c = getContentPane();
		BorderLayout b = new BorderLayout(5,7);
		c.setLayout(b);
		c.add(new JButton("North"),b.NORTH);
		c.add(new JButton("West"),b.WEST);
		c.add(new JButton("EAST"),b.EAST);
		c.add(new JButton("Center"),b.CENTER);
		c.add(new JButton("South"),b.SOUTH);
		
		this.setTitle("BorederLayout Practice");
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num2();
	}
}
