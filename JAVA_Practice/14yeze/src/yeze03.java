import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze03 extends JFrame{
	Container pane;
	
	yeze03(){
		pane = getContentPane();
		create();
		this.setTitle("툴바 만들기 예제");
		this.setSize(250,250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void create(){
		JToolBar tb = new JToolBar("SH Menu");
		tb.setBackground(Color.LIGHT_GRAY);
		tb.add(new JButton("New"));
		tb.add(new JButton(new ImageIcon("images/open.jpg")));
		tb.addSeparator();
		tb.add(new JButton(new ImageIcon("images/save.jpg")));
		tb.add(new JLabel("Search"));
		tb.add(new JTextField("TextField"));
		JComboBox combo = new JComboBox();
		combo.addItem("java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		tb.add(combo);
		pane.add(tb,BorderLayout.NORTH);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze03();
	}

}
