import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num2 extends JFrame{
	Container pane;
	String []st = {"C++","Python","JAVA","C","JSP","HTML5","C#","CSS"};
	JComboBox cb = new JComboBox(st);
	JTextField tf = new JTextField(10);
	
	num2(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		cb.addActionListener(new itm());
		
		pane.add(tf);
		pane.add(cb);
		this.setTitle("내용 옮기기");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class itm implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JComboBox temp = (JComboBox)e.getSource();
			int index=temp.getSelectedIndex();
			tf.setText(st[index]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num2();
	}

}
