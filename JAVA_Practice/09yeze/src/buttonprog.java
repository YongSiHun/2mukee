import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class buttonprog extends JFrame {
	buttonprog()
	{	
		Container ctp = getContentPane();
		ctp.setBackground(Color.GREEN);
		ctp.setLayout(new FlowLayout());
		ctp.add(new JButton("OK"));
		ctp.add(new JButton("Cancel"));
		ctp.add(new JButton("ignore"));
		this.setTitle("9과 첫번째 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,350);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new buttonprog();
	}

}
