import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze02 extends JFrame{
	Container pane;
	JLabel la = new JLabel("Hello!");
	
	yeze02(){
		pane = getContentPane();
		pane.setLayout(new BorderLayout());
		pane.add(la,BorderLayout.CENTER);
		createmenu();
		
		this.setTitle("메뉴 만들기");
		this.setSize(250,250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void createmenu(){
		JMenuBar mb = new JMenuBar();
		JMenu control = new JMenu("text");
		JMenuItem []item = new JMenuItem[4];
		String []name = {"Color","Font","Top","Bottom"};
		
		for (int i=0;i<4;i++){
			item[i]= new JMenuItem(name[i]);
			item[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String cmd = e.getActionCommand();
					if (cmd.equals("Color"))
						la.setForeground(Color.BLUE);
					else if (cmd.equals("Font"))
						la.setFont(new Font("Ravie",Font.ITALIC,30));
					else if (cmd.equals("Top"))
						la.setVerticalAlignment(SwingConstants.TOP);
					else if (cmd.equals("Bottom"))
						la.setVerticalAlignment(SwingConstants.BOTTOM);
				}});
			control.add(item[i]);
			}
		mb.add(control);
		this.setJMenuBar(mb);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze02();
	}

}
