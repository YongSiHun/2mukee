import java.awt.*;
import javax.swing.*;

public class button4 extends JFrame{
	button4(){
		GridLayout gr = new GridLayout(4,2,5,2);
		this.setLayout(gr);
		add(new JLabel("이름"));
		add(new JTextField(""));
		add(new JLabel("학번"));
		add(new JTextField(""));
		add(new JLabel("학과"));
		add(new JTextField(""));
		add(new JLabel("과목"));
		add(new JTextField(""));
		
		this.setTitle("그리드 레이아웃 예제");
		this.setSize(250,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new button4();
	}

}
