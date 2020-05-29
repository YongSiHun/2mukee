import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze04 extends JFrame{
	Container pane;
	JCheckBox[] fruits=new JCheckBox[3];
	String [] names={"���","��","ü��"};
	JLabel sumLabel;
	int sum=0;
	
	yeze04(){
		pane = this.getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add((new JLabel("��� 100��, �� 500��, ü�� 20000��")));
		for (int i=0;i<fruits.length;i++){
			fruits[i]= new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			pane.add(fruits[i]);
			fruits[i].addItemListener(new itmListener());
		}
		sumLabel=new JLabel("���� 0�� �Դϴ�.");
		pane.add(sumLabel);
		
		this.setTitle("üũ�ڽ��� ������ �̺�Ʈ ����");
		this.setSize(250,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class itmListener implements ItemListener{
		public void itemStateChanged(ItemEvent e){
			int selected=1;
			if (e.getStateChange()==ItemEvent.SELECTED)
				selected=1;
			else
				selected=-1;
			if(e.getItem()==fruits[0])
				sum+=100;
			else if (e.getItem()==fruits[1])
				sum+=500;
			else if (e.getItem()==fruits[2])
				sum+=20000;
			sumLabel.setText("����"+sum+"�� �Դϴ�.");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze04();
	}

}
