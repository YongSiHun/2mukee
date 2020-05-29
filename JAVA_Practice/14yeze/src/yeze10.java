import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze10 extends JFrame{
	Container pane;
	JLabel la = new JLabel("angKimotti");
	
	yeze10(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		la.setFont(new Font("Ravie",Font.ITALIC,30));
		pane.add(la);
		create();
		this.setTitle("컬러다이알로그");
		this.setSize(400,250);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void create(){
		JMenuBar mbar = new JMenuBar();
		JMenu filemenu = new JMenu("file");
		JMenuItem colorMan = new JMenuItem("Color");
		colorMan.addActionListener(new ActionListener(){
			JColorChooser chooser = new JColorChooser();
			
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("Color")){
					Color selectedColor = chooser.showDialog(null,"Color",Color.YELLOW);
					if (selectedColor!=null)
						la.setForeground(selectedColor);
				}
			}
		});
		filemenu.add(colorMan);
		mbar.add(filemenu);
		this.setJMenuBar(mbar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze10();
	}

}
