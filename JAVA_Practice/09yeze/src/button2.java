import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class button2 extends JFrame{
	button2(){
		FlowLayout f = new FlowLayout();
		setLayout(new FlowLayout(f.LEFT,30,40));
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
		
		this.setSize(300,250);
		this.setTitle("플로우 레이아웃");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new button2();

	}

}
