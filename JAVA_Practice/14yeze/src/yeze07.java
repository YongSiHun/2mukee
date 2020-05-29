import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class dialog extends JDialog{
	JTextField tf = new JTextField(10);
	JButton okbtn = new JButton("OK");
	
	public dialog(JFrame frame,String title){
		super(frame,title,true);
		this.setLayout(new FlowLayout());
		
		okbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		this.add(tf);
		this.add(okbtn);
		this.setSize(200,100);
	}
	String getInput(){
		if (tf.getText().length()==0)
			return null;
		else
			return tf.getText();
	}
}

public class yeze07 extends JFrame{
	dialog dial = new dialog(this,"Test Modal Dialog");
	
	public yeze07(){
		super("Dialog yeze frame");
		JButton btn = new JButton("Show Modal Dialog");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(true);
				String text = dial.getInput();
				if (text == null)
					return;
				JButton btn = (JButton)e.getSource();
				btn.setText(text);
			}
		});
		getContentPane().add(btn);
		this.setSize(250,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze07();
	}

}
