import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze3 extends JFrame{
	JLabel la;
	yeze3(){
		JPanel pa = new JPanel();
		setContentPane(pa);
		pa.setLayout(null);
		
		la=new JLabel("Follow you");
		la.setSize(60,20);
		la.setLocation(30,30);
		
		pa.addMouseListener(new mseve());

		pa.add(la);
		this.setTitle("Follow Text 마우스 어댑터 ver");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public class mseve extends MouseAdapter{
		public void mousePressed(MouseEvent e)
		{
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze3();
	}

}
