import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze06 extends JFrame{
	Container pane;
	JRadioButton [] rad = new JRadioButton[3];
	String []text={"사과","배","체리"};
	ImageIcon []img={
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/pear.jpg"),
			new ImageIcon("images/cherry.jpg")};
	JLabel imageLabel = new JLabel();
	
	yeze06(){
		pane=this.getContentPane();
		pane.setLayout(new BorderLayout());
		JPanel pan = new JPanel();
		pan.setBackground(Color.GRAY);
		ButtonGroup g = new ButtonGroup();
		
		for (int i=0;i<3;i++){
			rad[i]=new JRadioButton(text[i]);
			rad[i].addItemListener(new itmEvent());
			g.add(rad[i]);
			pan.add(rad[i]);
		}
		rad[2].setSelected(true);
		pane.add(pan,BorderLayout.NORTH);
		pane.add(imageLabel,BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		this.setTitle("라디오버튼 아이템 이벤트 예제");
		this.setSize(250,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class itmEvent implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if((e.getStateChange())==ItemEvent.DESELECTED)
				return;
			if (rad[0].isSelected())
				imageLabel.setIcon(img[0]);
			else if (rad[1].isSelected())
				imageLabel.setIcon(img[1]);
			else if (rad[2].isSelected())
				imageLabel.setIcon(img[2]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze06();
	}

}
