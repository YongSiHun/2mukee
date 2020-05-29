import java.awt.*;
import javax.swing.*;
import java.lang.Runnable;

public class num1{
	public static void main(String[] args) {
		Thread th = new Thread(new counting());
		th.start();
		System.out.println("After Start Thread");
		
		try{
			th.join();
		}
		catch(InterruptedException e){
			return;
		}
		System.out.println("After join");
	}
}

class counting implements Runnable{
	public void run() {
		for (int i=1;i<=100;i++){
			System.out.print(i+" ");
			if (i%10==0){
				System.out.println("");
			}
		}
	}
}
