import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class theory5 extends JFrame{
	
	theory5(){
		
		JButton btn=new JButton("Hello");
		this.setLayout(new FlowLayout());
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Click");
			}
		});
		this.add(btn);
		this.setTitle("이론문제");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new theory5();
	}

}
