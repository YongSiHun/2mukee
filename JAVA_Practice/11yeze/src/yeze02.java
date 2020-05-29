import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze02 extends JFrame{
	Container pane;
	JButton btn;
	
	yeze02(){
		pane = this.getContentPane();
		pane.setLayout(new FlowLayout());
		
		ImageIcon normal = new ImageIcon("images/gawi.jpg");
		ImageIcon rollover = new ImageIcon("images/bawi.jpg");
		ImageIcon pressed = new ImageIcon("images/bo.jpg");
		btn = new JButton("가위 바위 보",normal);
		btn.setRolloverIcon(rollover);
		btn.setPressedIcon(pressed);
		pane.add(btn);
		
		this.setTitle("이미지버튼설계");
		this.setSize(250,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze02();
	}

}
