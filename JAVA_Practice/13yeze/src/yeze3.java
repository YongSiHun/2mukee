import java.awt.*;
import javax.swing.*;

class flick_label extends JLabel implements Runnable{
	public flick_label(String text){
		super(text);
		this.setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	public void run() {
		int n=0;
		while(true){
			if (n==0)
				setBackground(Color.YELLOW);
			else
				setBackground(Color.GREEN);
			if (n==0) n=1;
			else n=0;
			try{
				Thread.sleep(250);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}

public class yeze3 extends JFrame{
	Font fon = new Font("³ª´®°íµñ",Font.ITALIC,30);
	yeze3(){
		Container c = new Container();
		c=getContentPane();
		c.setLayout(new FlowLayout());
		flick_label java = new flick_label("java");
		java.setFont(fon);
		flick_label cplus = new flick_label("C++"); 
		cplus.setFont(fon);
		JLabel py = new JLabel("Python");
		py.setFont(fon);
		
		c.add(java);
		c.add(py);
		c.add(cplus);

		this.setTitle("±ôºý±ôºý");
		this.setSize(300,150);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new yeze3();
	}

}
