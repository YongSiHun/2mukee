import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class anonyclass extends JFrame{
	anonyclass(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn = new JButton("�׼�");
		
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("�׼�"))
					b.setText("Action");
				else
					b.setText("�׼�");
				setTitle(b.getText());
			}
		});
		
		c.add(btn);
		this.setTitle("�͸�Ŭ������ �ۼ�");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new anonyclass();
	}

}
