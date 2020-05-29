import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze13 extends JFrame{
	Container pane;
	JLabel colorLabel;
	JSlider [] sl = new JSlider[3];
	
	yeze13(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		colorLabel= new JLabel("           SLIDER EXMPLE           ");
		for (int i=0;i<sl.length;i++){
			sl[i]= new JSlider(JSlider.HORIZONTAL,0,255,128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			sl[i].addChangeListener(new ChangeListener(){
				public void stateChanged(ChangeEvent e) {
					colorLabel.setBackground(
							new Color(sl[0].getValue(),
									sl[1].getValue(),
									sl[2].getValue()));
					}});
			pane.add(sl[i]);
		}
		sl[0].setForeground(Color.RED);
		sl[1].setForeground(Color.GREEN);
		sl[2].setForeground(Color.BLUE);
		colorLabel.setOpaque(true);
		colorLabel.setBackground(new Color
				(sl[0].getValue(),
				sl[1].getValue(),
				sl[2].getValue()));
		pane.add(colorLabel);
		this.setTitle("change Event & slider");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze13();
	}

}
