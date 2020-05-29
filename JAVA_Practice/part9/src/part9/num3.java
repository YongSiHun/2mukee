package part9;
import java.awt.*;
import javax.swing.*;

public class num3 extends JFrame{
	num3(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		for (int i=0;i<=9;i++)
		{
			c.add(new JButton(""+i));
		}
		
		this.setTitle("Ten Buttons Frame");
		this.setSize(900,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num3();
	}

}
