import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze4 extends JFrame {
	yeze4(){
		board b = new board();
		this.add(b,BorderLayout.CENTER);
		this.setTitle("»öÄ¥°øºÎ");
		this.setSize(200,350);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class board extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.BLUE);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.GREEN);
			g.fillRoundRect(10, 130, 50, 50, 20, 60);
			g.setColor(Color.MAGENTA);
			g.fillArc(10, 190, 50, 50, 0, 270);
			g.setColor(Color.ORANGE);
			int []x={30,10,30,60};
			int []y={250,275,300,275};
			g.fillPolygon(x,y,4);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze4();
	}

}
