import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze08 extends JFrame{
	Container pane;
	
	yeze08(){
		pane=getContentPane();
		pane.add(new mypanel(),BorderLayout.NORTH);
		this.setTitle("option pane yeze");
		this.setSize(600,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class mypanel extends Panel{
		JButton inputbtn = new JButton("Input Name");
		JTextField tf = new JTextField(10);
		JButton confirmbtn = new JButton("confirm");
		JButton messagebtn = new JButton("message");
		
		mypanel(){
			this.setBackground(Color.LIGHT_GRAY);
			this.add(inputbtn);
			this.add(confirmbtn);
			this.add(messagebtn);
			this.add(tf);
			
			inputbtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요 : ");
					if (name!=null)
						tf.setText(name);
				}
			});
			
			confirmbtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					int result = JOptionPane.showConfirmDialog(null,"계속하시겠습니까?","confirm",
							JOptionPane.YES_NO_OPTION);
					if (result==JOptionPane.CLOSED_OPTION)
						tf.setText("Just Closed without Selection");
					else if (result == JOptionPane.YES_OPTION)
						tf.setText("yes");
					else
						tf.setText("No");
				}				
			});
			
			messagebtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "조심하세요"
							,"Message",JOptionPane.ERROR_MESSAGE);
				}
			});
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze08();
	}

}
