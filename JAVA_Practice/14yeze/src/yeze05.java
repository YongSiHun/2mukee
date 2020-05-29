import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze05 extends JFrame{
	Container pane;
	
	yeze05(){
		pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		JLabel cherry = new JLabel(new ImageIcon("images/cherry.jpg"));
		JLabel apple = new JLabel(new ImageIcon("images/apple.jpg"));
		
		cherry.setToolTipText("당도 100% 마약체리");
		apple.setToolTipText("미친듯이 달콤한 황금사과!!! 백설공주도 이거먹고 죽음");
		pane.add(cherry);
		pane.add(apple);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		this.setTitle("툴팁 지연시간 제어");
		this.setSize(600,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze05();
	}

}
