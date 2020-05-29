import java.awt.*;
import javax.swing.*;

public class num4 extends JFrame {
	num4(){
		vibra bra = new vibra(this);
		
		this.setTitle("Áøµ¿±â");
		this.setSize(300,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bra.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new num4();
	}
}
class vibra extends Thread{
	JFrame fra;
	public vibra(JFrame fra){
		this.fra = fra;
	}
	
	public void run(){
		while(true){
			for (int i=1;i<10;i++){
				fra.setLocation(i*6,40);
			}
			for (int j=1;j<10;j++){
				fra.setLocation(40,j*6);
			}
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e){
				return;
			}
		}
	}
}
