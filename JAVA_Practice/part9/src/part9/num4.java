package part9;
import java.awt.*;
import javax.swing.*;

public class num4 extends JFrame{
	num4(){
		Container c = getContentPane();
		c.setLayout(new GridLayout(1,10));
		Color color[] = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.MAGENTA,
				Color.GRAY,Color.PINK,Color.LIGHT_GRAY};
		
		JButton []btn = new JButton[10];
		
		for (int i=0;i<=9;i++)
		{
			btn[i]=new JButton(""+i);
			btn[i].setBackground(color[i]);
			c.add(btn[i]);
		}

		
		this.setTitle("Ten Color Buttons");
		this.setSize(900,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num4();
	}

}
