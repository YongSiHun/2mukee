import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num6 extends JFrame{
	JPanel pan = new JPanel();
	JLabel la = new JLabel("C");
	
	num6(){
		this.setContentPane(pan);
		pan.setLayout(null);
		la.setLocation(100,100);
		la.setSize(20,20);
		la.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				JLabel l = (JLabel)e.getSource();
				int x = (int)(Math.random()*500);
				int y = (int)(Math.random()*500);
				l.setLocation(x,y);
			}
		});
		
		pan.add(la);
		this.setTitle("클릭 연습용 프로그램");
		this.setSize(550,550);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num6();
	}

}
