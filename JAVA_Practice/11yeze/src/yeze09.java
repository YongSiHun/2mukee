import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze09 extends JFrame{
	Container pane;
	String[] fruits={
			"apple","banana","kiwi","mango","pear","peach",
			"berry","strawberry","blackberry"};
	ImageIcon[] images = {
			new ImageIcon("images/save.jpg"),
			new ImageIcon("images/saveAs.jpg"),
			new ImageIcon("images/open.jpg"),
			new ImageIcon("images/openPressed.jpg")};
	
	yeze09(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		JList strList = new JList(fruits);
		pane.add(strList);
		
		JList imgList = new JList();
		imgList.setListData(images);
		pane.add(imgList);
		
		JList scrollList = new JList(fruits);
		pane.add(new JScrollPane(scrollList));
		
		this.setTitle("리스트 만들기 예제");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze09();
	}

}
