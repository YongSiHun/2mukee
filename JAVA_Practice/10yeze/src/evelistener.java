import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class evelistener extends JFrame{
	evelistener(){
		Container c = getContentPane();
		this.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		
		actionlistener lst = new actionlistener();
		btn.addActionListener(lst);
		c.add(btn);
		
		this.setTitle("Action �̺�Ʈ ������ �ۼ�");
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new evelistener();
	}
}

class actionlistener implements ActionListener{
	public void actionPerformed(ActionEvent e){
		JButton b = (JButton)e.getSource();
		if (b.getText().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");
	}
}
