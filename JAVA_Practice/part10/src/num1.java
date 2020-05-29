import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num1 extends JFrame{
	JLabel la = new JLabel("사랑해");
	JPanel pan = new JPanel();
	
	num1(){
		this.setContentPane(pan);
		pan.setLayout(new FlowLayout());
		
		la.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				JLabel l = (JLabel)e.getSource();
				l.setText("Love Java");
			}
			public void mouseExited(MouseEvent e){
				JLabel l=(JLabel)e.getSource();
				l.setText("사랑해");
			}
		});

		pan.add(la);
		this.setTitle("마우스 올리기 내리기");
		this.setSize(200,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num1();
	}

}
