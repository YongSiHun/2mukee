import java.awt.*;
import javax.swing.*;

class NorthPanel extends JPanel{
	public NorthPanel(){
		this.setBackground(Color.LIGHT_GRAY);
		FlowLayout f = new FlowLayout();
		this.setLayout(new FlowLayout());
		this.add(new JButton("open"));
		this.add(new JButton("Read"));
		this.add(new JButton("Close"));
	}
}

class CenterPanel extends JPanel{
	public CenterPanel(){		
		this.setLayout(null);
		JLabel l = new JLabel("Love");
		JLabel j = new JLabel("Java");
		JLabel h = new JLabel("Hello");
		
		l.setBounds(200,150,50,20);
		j.setBounds(130,100,50,20);
		h.setBounds(60,200,50,20);
		
		add(l);
		add(j);
		add(h);
	}
}
public class openChallenge extends JFrame{
	openChallenge(){
		
		NorthPanel n = new NorthPanel();
		CenterPanel c = new CenterPanel();
		
		add(n,BorderLayout.NORTH);
		add(c,BorderLayout.CENTER);
		
		this.setTitle("open Challenge 9 ");
		this.setSize(300,350);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new openChallenge();
	}

}
