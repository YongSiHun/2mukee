import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze04 extends JFrame{
	Container pane;
	
	yeze04(){
		pane = getContentPane();
		create();
		this.setTitle("툴바 만들기 예제");
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void create(){
		JToolBar tb = new JToolBar("SH Menu");
		tb.setBackground(Color.LIGHT_GRAY);
		
		JButton newbtn = new JButton("New");
		newbtn.setToolTipText("파일을 생성합니다.");
		tb.add(newbtn);
		
		JButton openbtn =  new JButton(new ImageIcon("images/open.jpg"));
		openbtn.setToolTipText("파일을 실행합니다.");		
		tb.add(openbtn);
		tb.addSeparator();
		
		JButton savebtn = new JButton(new ImageIcon("images/save.jpg"));
		savebtn.setToolTipText("파일을 저장합니다.");
		tb.add(savebtn);
		
		tb.add(new JLabel("Search"));
		
		JTextField tf = new JTextField("TextField");
		tf.setToolTipText("찾고자하는 문자열을 입력하세요");
		tb.add(tf);
		
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
		new yeze04();
	}

}
