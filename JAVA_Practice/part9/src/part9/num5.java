package part9;
import java.awt.*;
import javax.swing.*;

public class num5 extends JFrame{
	num5(){
		Container c = getContentPane();
		JLabel []l = new JLabel[16];
		Color []color = {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,Color.MAGENTA,
				Color.GRAY,Color.PINK,Color.LIGHT_GRAY,Color.WHITE,Color.DARK_GRAY,Color.BLACK,
				Color.ORANGE,Color.BLUE,Color.MAGENTA};
		c.setLayout(new GridLayout(4,4));
		
		for (int i=0;i<16;i++)
		{
			l[i] = new JLabel(""+i);
			l[i].setBackground(color[i]);
			l[i].setOpaque(true);
			c.add(l[i]);
		}
		this.setTitle("4x4 Color Frame");
		this.setSize(900,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num5();
	}

}
