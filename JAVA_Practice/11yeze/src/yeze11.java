import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze11 extends JFrame{
	Container pane;
	String []fruits={"apple","banana","kiwi","mango"};
	ImageIcon []img = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")};
	JLabel la = new JLabel(img[0]);
	
	yeze11(){
		pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		JComboBox strBox = new JComboBox(fruits);
		strBox.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				int index=cb.getSelectedIndex();
				la.setIcon(img[index]);
			}
		});
		pane.add(strBox);
		pane.add(la);
		
		this.setTitle("콤보박스 활용 예제");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze11();
	}

}
