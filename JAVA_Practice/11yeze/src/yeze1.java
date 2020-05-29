import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze1 extends JFrame{
	Container pane;
	JLabel la;
	JButton b1,b2,b3,b4;
	
	yeze1(){
		pane=getContentPane();
		pane.setLayout(new FlowLayout());
		
		b1=new JButton("위치와 크기 정보");
		b1.addActionListener(new btnListener());
		
		b2=new JButton("모양정보");
		b2.setOpaque(true);
		b2.setForeground(Color.MAGENTA);
		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("고딕체",Font.ITALIC,20));
		b2.addActionListener(new btnListener());
		
		b3=new JButton("작동하지 않는 버튼");
		b3.setEnabled(false);
		b3.addActionListener(new btnListener());
		
		b4=new JButton("숨기기/보이기");
		b4.addActionListener(new btnListener());
		
		pane.add(b1);
		pane.add(b2);
		pane.add(b3);
		pane.add(b4);
		
		this.setTitle("스윙컴포넌트 공통메소드 예제");
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class btnListener implements ActionListener{
		public void actionPerformed (ActionEvent e){
			Object source = e.getSource();
			
			if (source == b1){
				System.out.println("버튼의 위치와 크기");
				System.out.println("위치 = ("+b1.getX()+","+b1.getY()+")");
				System.out.println("크기 = ("+b1.getWidth()+"x"+b1.getHeight()+")");
				
				JPanel c = (JPanel)b2.getParent();
				System.out.println("컨텐트팬의 위치와 크기");
				System.out.println("위치 = ( "+c.getX()+","+c.getY()+")");
				System.out.println("크기 = ("+c.getWidth()+"x"+c.getHeight()+")");				
			}
			else if (source == b2){
				System.out.println("폰트 = "+b2.getFont());
				System.out.println("배경색 = "+b2.getBackground());
				System.out.println("글자색 = "+b2.getForeground());
			}
			else {
				if (b1.isVisible()){
					b1.setVisible(false);
					b2.setVisible(false);
					b3.setVisible(false);
				}
				else{
					b1.setVisible(true);
					b2.setVisible(true);
					b3.setVisible(true);
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze1();
	}

}
