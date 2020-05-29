import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze1 extends JFrame{
	yeze1(){
		Container c = getContentPane();
		JButton btn = new JButton("Mouse Event Test Button");
		c.setLayout(new FlowLayout());
		btn.setBackground(Color.YELLOW);
		
		mouselistener m = new mouselistener();
		btn.addMouseListener(m);
		
		c.add(btn);
		this.setTitle("버튼에 마우스 이벤트 리스너");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze1();
	}
}

class mouselistener implements MouseListener{
	public void mouseEntered(MouseEvent e)
	{
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.RED);
	}
	public void mouseExited(MouseEvent e)
	{
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.YELLOW);
	}
	public void mousePressed(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{}
	public void mouseClicked(MouseEvent e)
	{}
}
