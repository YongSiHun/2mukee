import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze07 extends JFrame{
	Container pane;
	
	yeze07(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add(new JLabel("�̸� : "));
		pane.add(new JTextField(8));
		pane.add(new JLabel("�а� : "));
		pane.add(new JTextField("��Ź ������ �а�",10));
		pane.add(new JLabel("�ּ� : "));
		pane.add(new JTextField("�����...",15));
		
		this.setTitle("�ؽ�Ʈ�ʵ� ����� ����");
		this.setSize(350,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze07();
	}

}
