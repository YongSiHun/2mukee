import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num3 extends JFrame{
	JPanel pan = new JPanel();
	StringBuffer s = new StringBuffer("Love Java");
	JLabel la = new JLabel(s.toString());
	
	num3(){
		this.setContentPane(pan);
		pan.setLayout(new FlowLayout());
		
		la.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_LEFT){
					s.reverse();
					la.setText(s.toString());
				}
			}
		});
		
		pan.add(la);
		this.setTitle("LEFT키로 문자열 뒤집기");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		la.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num3();
	}

}
