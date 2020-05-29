import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num8 extends JFrame{
	Container pane;
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,0);
	JLabel la=new JLabel();
	JTextArea text = new JTextArea(7,100);
	
	num8(){
		pane=getContentPane();
		pane.setLayout(new BorderLayout());
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		
		text.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (text.getText().length()<=100){
					slider.setValue(text.getText().length());
				}
				else{
					text.setEnabled(false);
				}
			}
		});
		
		slider.setEnabled(false);
		pane.add(text,BorderLayout.NORTH);
		pane.add(slider,BorderLayout.CENTER);
		
		this.setTitle("Text Sliderbar");
		this.setSize(500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num8();
	}
}
