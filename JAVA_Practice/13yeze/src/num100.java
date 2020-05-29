
class share_data{
	int sum=0;
}

class Count_Thread extends Thread{
	share_data obj;
	int num;
	public Count_Thread(share_data obj,int num){
		this.obj=obj;
		this.num= num;
	}
	public void run(){
		synchronized(obj){
			for (int i=0;i<100;i++)
				obj.sum+=i;
			obj.notifyAll();
		}
	}
}

class Print_Thread extends Thread{
	share_data obj;
	public Print_Thread(share_data obj){
		this.obj=obj;
	}
	public void run(){
		try{
			synchronized(obj){
				obj.wait();
				System.out.println("sum = "+obj.sum);
			}
		}
		catch(InterruptedException e){
			return;
		}
	}
}

public class num100 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		share_data obj = new share_data();
		Count_Thread ct = new Count_Thread(obj,100);
		Print_Thread pt = new Print_Thread(obj);
		ct.start();
		pt.start();
	}
}

