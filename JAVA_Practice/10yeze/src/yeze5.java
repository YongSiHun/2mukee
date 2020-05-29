import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze5 extends JFrame{
	JPanel pa = new JPanel();
	JLabel la = new JLabel();
			
	yeze5(){
		this.setContentPane(pa);
		pa.addKeyListener(new KeyListener());
		pa.add(la);
		this.setTitle("KeyCode예제 : F1키 녹색, %키 노란색");
		this.setSize(300,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pa.requestFocus();
	}
	class KeyListener extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			la.setText(e.getKeyText(e.getKeyCode()));
			if (e.getKeyChar() == '%')
				pa.setBackground(Color.YELLOW);
			else if (e.getKeyCode() == KeyEvent.VK_F1)
				pa.setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze5();
	}

}
