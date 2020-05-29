import javax.swing.*;
import java.awt.*;

public class button5 extends JFrame{
	button5(){
		this.setLayout(null);
		JLabel la = new JLabel("Hello Press Button!!");
		la.setBounds(130,50,200,20);
		add(la);
		
		for (int i=1;i<=9;i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			add(b);
		}
		this.setTitle("배치관리자 없는 prog");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new button5();

	}

}
