import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze07 extends JFrame{
	Container pane;
	
	yeze07(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("이름 : "));
		pane.add(new JTextField(8));
		pane.add(new JLabel("학과 : "));
		pane.add(new JTextField("목탁 디자인 학과",10));
		pane.add(new JLabel("주소 : "));
		pane.add(new JTextField("서울시...",15));
		
		this.setTitle("텍스트필드 만들기 에제");
		this.setSize(350,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze07();
	}

}
