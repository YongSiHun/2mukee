import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze03 extends JFrame{
	Container pane;
	JButton cherrybtn;
	JCheckBox apple,pear,cherry;
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
	
	yeze03(){
		pane=this.getContentPane();
		pane.setLayout(new FlowLayout());
		
		apple = new JCheckBox("사과");
		pear = new JCheckBox("배");
		cherry = new JCheckBox("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		pane.add(apple);
		pane.add(pear);
		pane.add(cherry);
		
		this.setTitle("체크박스 만들기");
		this.setSize(350,350);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze03();

	}

}
