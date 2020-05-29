import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class yeze08 extends JFrame{
	Container pane;
	
	yeze08(){
		pane=getContentPane();
		pane.add(new centerpanel(),BorderLayout.CENTER);
		
		this.setTitle("텍스트 영역 만들기 예제");
		this.setSize(350,350);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class centerpanel extends JPanel{
		JTextField tf;
		JButton btn;
		JTextArea ta;
		
		centerpanel(){
			tf=new JTextField(20);
			btn = new JButton("추가");
			btn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText()+"\n");
					tf.setText("");
				}
			});
			tf.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText()+"\n");
					tf.setText("");
				}
			});
			ta=new JTextArea("",7,20);
			this.add(new JLabel("아래창엥 문자열을 입력하고 버튼을 클릭하세요."));
			this.add(tf);
			this.add(btn);
			this.add(new JScrollPane(ta));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze08();
	}

}
