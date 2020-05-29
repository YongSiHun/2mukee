import java.awt.*;
import javax.swing.*;

public class button3 extends JFrame{
	button3(){
		BorderLayout bor = new BorderLayout();
		this.setLayout(new BorderLayout());
		add(new JButton("add"),bor.NORTH);
		add(new JButton("sub"),bor.SOUTH);
		add(new JButton("mul"),bor.EAST);
		add(new JButton("div"),bor.WEST);
		add(new JButton("Calculate"),bor.CENTER);
		
		this.setTitle("보더 레이아웃 예제");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new button3();

	}

}
