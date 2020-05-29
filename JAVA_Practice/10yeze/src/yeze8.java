import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze8 extends JFrame{
	JPanel pa = new JPanel();
	
	yeze8(){
		this.setContentPane(pa);
		pa.addMouseListener(new click());
		this.setTitle("더블클릭 색 변경");
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class click extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			if(e.getClickCount()==2){
				int r=(int)(Math.random()*256);
				int g=(int)(Math.random()*256);
				int b=(int)(Math.random()*256);
				
				JPanel p = (JPanel)e.getSource();
				p.setBackground(new Color(r,g,b));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze8();
	}

}
