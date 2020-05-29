import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num7 extends JFrame{
	Container pane;
	JSlider slider = new JSlider(JSlider.HORIZONTAL,1,100,41);
	String str = "I Love Java";
	JLabel la = new JLabel(str);
	
	num7(){
		pane=getContentPane();
		pane.setLayout(new BorderLayout());
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				int size=slider.getValue();
				la.setFont(new Font("Arial",Font.PLAIN,size));
			}
		});
		
		pane.add(slider,BorderLayout.NORTH);
		pane.add(la,BorderLayout.CENTER);
		this.setTitle("JSlider Font control");
		this.setSize(600,500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num7();
	}

}
