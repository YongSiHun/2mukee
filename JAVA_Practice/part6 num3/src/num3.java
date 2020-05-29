import java.util.*;

public class num3 
{
	public static void main(String[] args) 
	{
		Calendar now = Calendar.getInstance();
		
		int time = now.get(Calendar.HOUR_OF_DAY);
		
		if (time>4&&time<=12)
			System.out.println("Good Morning");
		if (time>12&&time<18)
			System.out.println("Good Afternoon");
		if (time>=18&&time<22)
			System.out.println("Good Evening");
		if (time>=22||time<=4)
			System.out.println("Good Night");
	}
}
