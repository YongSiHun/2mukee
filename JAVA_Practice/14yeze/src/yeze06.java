import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class dialogo extends JDialog{
	JTextField tf = new JTextField(10);
	JButton okbtn = new JButton("OK");
	
	public dialogo(JFrame frame,String title){
		super(frame,title);
		this.setLayout(new FlowLayout());
		
		okbtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
			}
		});
		this.add(tf);
		this.add(okbtn);
		
		this.setSize(400,200);
		this.setVisible(true);

	}
}
	
public class yeze06 extends JFrame{
	dialogo dial = new dialogo(this,"Mini Dialog");
	public yeze06(){
		super("다이알로그 예제");
		JButton btn = new JButton("Show Dialog");
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(true);
			}	
		});
		getContentPane().add(btn);
		this.setSize(250,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze06();
	}
}


