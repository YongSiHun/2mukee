import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze10 extends JFrame{
	JPanel pane = new JPanel();
	String []fruits = {"apple","orange","blueberry","strawberry",
			"banana","peach","pear","Blackberry","kiwi","mango"};
	String []names={"�ڿ���","���缺","����","�ڹڲ�","are you best?"};
	
	yeze10(){
		this.add(pane);
		pane.setLayout(new FlowLayout());
		
		JComboBox fruitCombo = new JComboBox(fruits);
		JComboBox nameCombo = new JComboBox();
		
		for (int i=0;i<names.length;i++)
			nameCombo.addItem(names[i]);
		pane.add(fruitCombo);
		pane.add(nameCombo);
		
		this.setTitle("����Ʈ ����� ����");
		this.setSize(300,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze10();
	}
}
