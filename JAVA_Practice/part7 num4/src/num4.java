import java.util.ArrayList;
import java.util.Iterator;

public class num4 
{
	public static void main(String[] args) 
	{
		ArrayList<Double>a=new ArrayList<Double>();
		for (int i=0;i<20;i++)
		{
			double d = Math.random()*100;
			a.add(d);
		}
		Iterator<Double>it=a.iterator();
		while(it.hasNext())
		{
			Double n=it.next();
			System.out.println(n);
		}
	}

}
