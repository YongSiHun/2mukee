class Cpoint
{
	int a,b;

	public Cpoint(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	public String show()
	{
		System.out.println("("+a+","+b+")"+other());
		return null;
	}
	
	public String other()
	{
		return "";
	}
	
	public String toString()
	{
		return "("+a+","+b+")"+"¿‘¥œ¥Ÿ";
	}
}

class CColorPoint extends Cpoint
{
	String c;
	public CColorPoint(int a,int b,String c)
	{
		super (a,b);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public String other()
	{
		return c;
	}
}


public class num4 
{
	public static void main(String[] args) 
	{
		Cpoint a,b;
		
		a = new Cpoint(2,3);
		b = new CColorPoint(3,4,"red");
		
		a.show();
		b.show();
		System.out.println(a);
		System.out.println(b);
	}

}
