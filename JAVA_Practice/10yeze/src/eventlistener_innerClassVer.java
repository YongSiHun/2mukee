import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class eventlistener_innerClassVer extends JFrame{
	eventlistener_innerClassVer(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.LIGHT_GRAY);
		
		JButton btn = new JButton("Action");
		btn.setBackground(Color.YELLOW);
		
		btn.addActionListener(new actionlistenman());
		
		c.add(btn);
		this.setTitle("Inner Class 구현");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class actionlistenman implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton b = (JButton)e.getSource();
			if (b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			
			setTitle(b.getText());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new eventlistener_innerClassVer();
	}
}


