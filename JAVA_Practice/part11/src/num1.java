import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num1 extends JFrame{
	Container pane;
	JCheckBox[] box=new JCheckBox[2];
	JButton btn = new JButton("test button");
	
	num1(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		box[0]=new JCheckBox("버튼 비활성화");
		box[1]=new JCheckBox("버튼 감추기");
		
		for (int i=0;i<box.length;i++){
			box[i].addItemListener(new operation());
			pane.add(box[i]);
		}
		pane.add(btn);
		this.setTitle("checkbox");
		this.setSize(300,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class operation implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			int selected =1;
			
			if(e.getStateChange()==ItemEvent.SELECTED)
				selected=1;
			else
				selected=-1;
			
			if (e.getItem()==box[0]){
				btn.setEnabled(false);
				if (selected==-1)
					btn.setEnabled(true);
			}
			else if (e.getItem()==box[1]){
				btn.setVisible(false);
				if (selected==-1)
					btn.setVisible(true);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num1();
	}
}
