import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num7 extends JFrame{
	JPanel pan = new JPanel();
	JLabel la = new JLabel("Love Java");
	int size=10;

	num7(){

		this.setContentPane(pan);
		pan.setLayout(new FlowLayout());
		la.setFont(new Font("Arial",Font.PLAIN,size));
		
		la.addMouseWheelListener(new MouseWheelListener(){
			public void mouseWheelMoved(MouseWheelEvent e){
				int n = e.getWheelRotation();
				
				if(n<0&&size>5)
					size+=5;
				else 
					size-=5;
				la.setFont(new Font("Arial",Font.PLAIN,size));
			}
		});

		pan.add(la);
		this.setTitle("마우스 휠을 돌려 폰트크기 조절하기");
		this.setSize(600,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num7();
	}

}
