import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class num10 extends JFrame{
	Container pane;
	JLabel []la=new JLabel[10];
	int count =0;
	
	num10(){
		pane=getContentPane();
		pane.setLayout(null);
		
		for (int i=0;i<la.length;i++){
			int x=(int)(Math.random()*250);
			int y=(int)(Math.random()*250);
			
			la[i]=new JLabel(Integer.toString(i));
			la[i].setBounds(x, y, 15, 15);
			la[i].addMouseListener(new MouseAdapter(){
				public void mouseClicked(MouseEvent e){
					JLabel temp = (JLabel)e.getSource();
					if (Integer.parseInt(temp.getText())==count){
						temp.setVisible(false);
						count++;
					}
					else{
						count=0;
						for(int i=0;i<la.length;i++){
							int x=(int)(Math.random()*250);
							int y=(int)(Math.random()*250);
							la[i].setLocation(x,y);
							la[i].setVisible(true);
						}
					}
					if (count==10){
						count=0;
						for(int i=0;i<la.length;i++){
							int x=(int)(Math.random()*250);
							int y=(int)(Math.random()*250);
							la[i].setLocation(x,y);
							la[i].setVisible(true);
						}
					}
				}
			});
			pane.add(la[i]);
		}
		
		this.setTitle("Ten Label Click");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num10();
	}
}
