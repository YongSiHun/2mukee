import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze4 extends JFrame{
	JPanel pa = new JPanel();
	JLabel []KeyMessage;
	
	yeze4(){
		this.setTitle("KeyCode¿Í KeyListener È°¿ë");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(pa);
		pa.addKeyListener(new keylistenman());
		
		KeyMessage = new JLabel[3];
		KeyMessage[0]=new JLabel(" getKeyCode() ");
		KeyMessage[1]=new JLabel(" getKeyChar() ");
		KeyMessage[2]=new JLabel(" getKeyText() ");
		
		for (int i=0;i<KeyMessage.length;i++){
			pa.add(KeyMessage[i]);
			KeyMessage[i].setOpaque(true);
			KeyMessage[i].setBackground(Color.CYAN);
		}
		this.setSize(300,300);
		this.setVisible(true);
		pa.requestFocus();
	}
	class keylistenman extends KeyAdapter{
		public void keyPressed(KeyEvent e){
			int KeyCode = e.getKeyCode();
			char KeyChar = e.getKeyChar();
			KeyMessage[0].setText(Integer.toString(KeyCode));
			KeyMessage[1].setText(Character.toString(KeyChar));
			KeyMessage[2].setText(e.getKeyText(KeyCode));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze4();
	}
}
