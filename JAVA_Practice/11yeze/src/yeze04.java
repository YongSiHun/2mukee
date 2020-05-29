import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze04 extends JFrame{
	Container pane;
	JCheckBox[] fruits=new JCheckBox[3];
	String [] names={"사과","배","체리"};
	JLabel sumLabel;
	int sum=0;
	
	yeze04(){
		pane = this.getContentPane();
		pane.setLayout(new FlowLayout());
		
		pane.add((new JLabel("사과 100원, 배 500원, 체리 20000원")));
		for (int i=0;i<fruits.length;i++){
			fruits[i]= new JCheckBox(names[i]);
			fruits[i].setBorderPainted(true);
			pane.add(fruits[i]);
			fruits[i].addItemListener(new itmListener());
		}
		sumLabel=new JLabel("현재 0원 입니다.");
		pane.add(sumLabel);
		
		this.setTitle("체크박스와 아이템 이벤트 예제");
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
			sumLabel.setText("현재"+sum+"원 입니다.");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze04();
	}

}
