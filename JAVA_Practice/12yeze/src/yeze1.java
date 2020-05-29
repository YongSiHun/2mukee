import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze1 extends JFrame{
	Container pane;
	yeze1(){
		pane=getContentPane();		
		paint_panel p = new paint_panel();
		pane.add(p,BorderLayout.CENTER);		
		this.setTitle("nemo paint");
		this.setSize(250,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class paint_panel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10,10,50,50);
			g.drawRect(50,50,50,50);
			g.drawRect(90,90,50,50);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze1();
	}

}