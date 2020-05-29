import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num5 extends JFrame{
	Container pane;
	JTextField tf;
	JLabel la = new JLabel("입력한 후 다른 창에 마우스 클릭하면 대문자로 변합니다.");
	
	num5(){
		pane = getContentPane();
		pane.setLayout(new FlowLayout());
		tf=new JTextField(20);
		tf.addFocusListener(new FocusListener(){
			public void focusGained(FocusEvent e) {}
			public void focusLost(FocusEvent e) {
				JTextField temp = (JTextField) e.getSource();
				temp.setText(tf.getText().toString().toUpperCase());
			}
		});
		pane.add(la);
		pane.add(tf);
		
		this.setTitle("Focus Practice Frame");
		this.setSize(450,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf.requestFocus();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num5();
	}

}
