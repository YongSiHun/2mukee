import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze12 extends JFrame{
	Container pane;
	
	yeze12(){
		pane = getContentPane();
		pane.setLayout(new FlowLayout());
		
		JSlider sli = new JSlider(JSlider.HORIZONTAL,0,200,100);
		sli.setPaintLabels(true);
		sli.setPaintTicks(true);
		sli.setPaintTrack(true);
		sli.setMajorTickSpacing(50);
		sli.setMinorTickSpacing(10);
		
		pane.add(sli);
		
		this.setTitle("슬라이더 만들기 예제");
		this.setSize(300,100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze12();
	}

}
