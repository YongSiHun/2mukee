abstract class Mypoint
{
	int x;
	int y;
	
	public Mypoint(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	protected abstract void move (int x,int y);
	protected abstract void reverse();
	protected void show()
	{
		System.out.println(x+","+y);
	}
}

class MyColorPoint extends Mypoint
{
	String Color;

	public MyColorPoint(int x,int y,String Color) 
	{
		super(x,y);
		this.Color=Color;
	}
	
	protected void move(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	protected void reverse()
	{
		int temp;
		temp = x;
		x=y;
		y=temp;
	}
	
	protected void show()
	{
		System.out.println(x+","+y+","+Color);
	}
}


public class num5 
{
	public static void main(String[] args) 
	{
		Mypoint p = new MyColorPoint(2,3,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}

}
