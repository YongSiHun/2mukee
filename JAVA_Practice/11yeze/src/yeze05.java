import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze05 extends JFrame{
	Container pane;
	JButton cherrybtn;
	JRadioButton apple,pear,cherry;
	ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
	ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");
	
	yeze05(){
		pane=this.getContentPane();
		pane.setLayout(new FlowLayout());
		
		apple = new JRadioButton("사과");
		pear = new JRadioButton("배");
		cherry = new JRadioButton("체리",cherryIcon);
		cherry.setBorderPainted(true);
		cherry.setSelectedIcon(selectedCherryIcon);
		
		ButtonGroup g = new ButtonGroup();
		g.add(apple);
		g.add(pear);
		g.add(cherry);
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
		new yeze05();

	}

}
