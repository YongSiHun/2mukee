import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num6 extends JFrame{
	Container pane;
	JSlider slider;
	JLabel la = new JLabel("100");
	
	num6(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(50);
		
		slider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e) {
				int str = slider.getValue();
				la.setText(Integer.toString(str));
			}
		});
		
		pane.add(slider);
		pane.add(la);
		this.setTitle("JSlider frame");
		this.setSize(400,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num6();
	}

}
