import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class theory3 extends JFrame{
	JPanel pan = new JPanel();
	JButton btn = new JButton("Exit");
	
	theory3(){
		this.setContentPane(pan);
		pan.setLayout(new FlowLayout());
		pan.add(btn);
		btn.addActionListener(new MyactionListener());
		
		this.setTitle("그 버튼을 누르지마");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class MyactionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b=(JButton)e.getSource();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new theory3();
	}

}
