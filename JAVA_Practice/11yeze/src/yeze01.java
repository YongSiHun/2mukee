import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze01 extends JFrame{
	Container pane;
	
	yeze01(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		JLabel textla = new JLabel("����մϴ�");
		ImageIcon img1 = new ImageIcon("images/beauty.jpg");
		JLabel imgla = new JLabel(img1);
		ImageIcon img2 = new ImageIcon("images/icon.jpg");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���.",img2,SwingConstants.CENTER);
		
		pane.add(textla);
		pane.add(imgla);
		pane.add(label);
		
		this.setTitle("���̺� ����");
		this.setSize(400,600);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze01();
	}

}
