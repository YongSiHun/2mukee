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
			g.drawString("쓰레드 프로그래밍까지 화이팅 *^^*", 30, 30);
			g.drawString("기말고사 다 찢어버리자!", 60, 60);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		new yeze2();
	}

}