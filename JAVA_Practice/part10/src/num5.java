import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num5 extends JFrame{
	JPanel pan = new JPanel();
	JLabel la = new JLabel("Love Java");
	Font f = la.getFont();
	int size = f.getSize();
	
	num5(){
		this.setContentPane(pan);
		pan.setLayout(new FlowLayout());
		la.setFont(new Font("Arial",Font.PLAIN,5));
		
		la.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if (e.getKeyChar()=='+'){
					size+=5;
					la.setFont(new Font("Arial",Font.PLAIN,size));
				}
				else if (e.getKeyChar()=='-'){
					size-=5;
					la.setFont(new Font("Arial",Font.PLAIN,size));
					if (size<=5){
						size=5;
						la.setFont(new Font("Arial",Font.PLAIN,size));
					}
				}
			}
		});
		
		pan.add(la);
		this.setTitle("+,- 키로 폰트조절");
		this.setSize(400,200);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		la.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num5();
	}

}
