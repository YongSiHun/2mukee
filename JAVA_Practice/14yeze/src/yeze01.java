import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze01 extends JFrame{
	Container pane;

	
	yeze01(){
		createmenu();
		this.setTitle("메뉴 만들기 예제");
		this.setSize(250,250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	void createmenu(){
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("file");
		file.add(new JMenuItem("New"));
		file.add(new JMenuItem("Open"));
		file.addSeparator();
		file.add(new JMenuItem("Save"));
		file.add(new JMenuItem("Save As"));
		
		mb.add(file);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		this.setJMenuBar(mb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze01();
	}

}
