import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze2 extends JFrame{
	yeze2(){
		Container c = new Container();
		c=getContentPane();
		
		board b= new board();
		c.add(b,BorderLayout.CENTER);
		
		this.setTitle("drawString");
		this.setSize(250,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class board extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("������ ���α׷��ֱ��� ȭ���� *^^*", 30, 30);
			g.drawString("�⸻��� �� ���������!", 60, 60);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		new yeze2();
	}

}