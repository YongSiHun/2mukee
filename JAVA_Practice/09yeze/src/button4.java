import java.awt.*;
import javax.swing.*;

public class button4 extends JFrame{
	button4(){
		GridLayout gr = new GridLayout(4,2,5,2);
		this.setLayout(gr);
		add(new JLabel("�̸�"));
		add(new JTextField(""));
		add(new JLabel("�й�"));
		add(new JTextField(""));
		add(new JLabel("�а�"));
		add(new JTextField(""));
		add(new JLabel("����"));
		add(new JTextField(""));
		
		this.setTitle("�׸��� ���̾ƿ� ����");
		this.setSize(250,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new button4();
	}

}
