
public class num8<E> 
{
	private E s;
	
	public num8(E s)
	{
		this.s=s;
	}
	
	void setS(E s)
	{
		this.s=s;
	}
	
	E getS()
	{
		return s;
	}
	
	public static void main(String[] args) 
	{
		num8 myclass = new num8("a");
		myclass.setS("JAVA");
		System.out.println(myclass.getS());
	}

}
