import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num4 extends JFrame{
	JPanel pan = new JPanel();
	String s = new String("Love Java");
	JLabel la = new JLabel(s);
	int i=0;
	
	num4(){
		this.setContentPane(pan);
		pan.setLayout(new FlowLayout());
		
		la.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyCode()==KeyEvent.VK_LEFT){
					la.setText(s.substring(i)+s.substring(0, i));
					i++;
					if (i==s.length())
						i=0;
				}
			}
		});
		
		pan.add(la);
		this.setTitle("Left키로 문자열 이동");
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		la.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num4();
	}

}
