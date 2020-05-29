class Mypoint
{
	int x,y;

	public Mypoint(int i, int j) 
	{
		this.x=i;
		this.y=j;
	}

	public String toString()
	{	
		return "Mypoint ("+x+","+y+")";
	}

}

public class num1
{
	public static void main(String[] args)
	{
		Mypoint a = new Mypoint(3,20);
		System.out.println(a);
	}

}
