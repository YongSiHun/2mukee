import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num2 extends JFrame{
	JPanel pan = new JPanel();
	
	num2(){
		this.setContentPane(pan);
		pan.setBackground(Color.GREEN);
		pan.addMouseMotionListener(new MouseAdapter(){
			
			public void mouseDragged(MouseEvent e){
				JPanel p = (JPanel)e.getSource();
				p.setBackground(Color.YELLOW);
			}
		});
		pan.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent e){
				JPanel p = (JPanel)e.getSource();
				p.setBackground(Color.GREEN);
			}
		});
		
		this.setTitle("µå·¡±ë µ¿¾È YELLOW");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num2();
	}

}
