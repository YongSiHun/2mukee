import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze11 extends JFrame{
	Container pane;
	yeze11(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		JTabbedPane tab = createTab();
		pane.add(tab);
		this.setTitle("Tab Pane");
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	JTabbedPane createTab(){
		JTabbedPane tab = new JTabbedPane(JTabbedPane.LEFT);
		tab.addTab("tab1",new JLabel(new ImageIcon("images/img1.jpg")));
		tab.addTab("tab2",new JLabel(new ImageIcon("images/img2.jpg")));
		tab.addTab("tab3",new PanelOfKing());
		return tab;
	}
	class PanelOfKing extends JPanel{
		PanelOfKing(){
			this.setBackground(Color.YELLOW);
		}
		public void paint(Graphics g){
			super.paint(g);
			g.setColor(Color.RED);
			g.fillRect(10,10,50,50);
			g.setColor(Color.BLUE);
			g.fillOval(10,70,50,50);
			g.setColor(Color.BLACK);
			g.drawString("taiwan Num.1", 30, 50);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze11();
	}

}
