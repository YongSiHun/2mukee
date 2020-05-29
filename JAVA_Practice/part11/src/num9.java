import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num9 extends JFrame{
	Container pane_north = new Container();
	Container pane_center = new Container();
	ImageIcon []img={
			new ImageIcon("images/gawi.jpg"),
			new ImageIcon("images/bawi.jpg"),
			new ImageIcon("images/bo.jpg")};
	JButton []btn=new JButton[3];
	JLabel []la={
			new JLabel("me"),
			new JLabel("com"),
			new JLabel("Computer!!"),
			new JLabel("Me!!!"),
			new JLabel("Same!!!")};
	
	num9(){
		this.setLayout(new BorderLayout());
		pane_north.setLayout(new FlowLayout());
		for (int i=0;i<3;i++){
			btn[i]=new JButton(img[i]);
			btn[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					int com = (int) (Math.random()*2)+0;
					JButton temp= (JButton)e.getSource();
					if (temp.getName() == "images/gawi.jpg" ){
						System.out.println("gwi");
					}
					if (temp.getName() == "images/bawi.jpg" ){
						System.out.println("bwi");
					}
					if (temp.getName() == "images/bo.jpg" ){
						System.out.println("bo");
					}
				}});
			pane_north.add(btn[i]);
		}
		
		
		this.add(pane_north,BorderLayout.NORTH);
		this.add(pane_center,BorderLayout.CENTER);
		this.setTitle("Rock Cisor Paper");
		this.setSize(600,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num9();
	}
}
