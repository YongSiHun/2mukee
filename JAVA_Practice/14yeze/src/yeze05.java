import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze05 extends JFrame{
	Container pane;
	
	yeze05(){
		pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		JLabel cherry = new JLabel(new ImageIcon("images/cherry.jpg"));
		JLabel apple = new JLabel(new ImageIcon("images/apple.jpg"));
		
		cherry.setToolTipText("�絵 100% ����ü��");
		apple.setToolTipText("��ģ���� ������ Ȳ�ݻ��!!! �鼳���ֵ� �̰Ÿ԰� ����");
		pane.add(cherry);
		pane.add(apple);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		this.setTitle("���� �����ð� ����");
		this.setSize(600,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze05();
	}

}
