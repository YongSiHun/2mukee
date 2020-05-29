import java.util.*;

public class enum2 
{

	public static void main(String[] args) 
	{
		ArrayList<Character> data = new ArrayList<Character>();
		Scanner input = new Scanner(System.in);
		char c;
		
		while (true)
		{
			System.out.print("학점을 입력하시오 (E or e is exit) >>> ");
			c=input.next().charAt(0);
			if (c=='E'||c=='e')
				break;
			data.add(c);
		}
		
		for (int i=0;i<data.size();i++)
		{
			if (data.get(i)=='A'||data.get(i)=='a')
				System.out.print(" 4.0 ");
			if (data.get(i)=='B'||data.get(i)=='b')
				System.out.print(" 3.0 ");
			if (data.get(i)=='C'||data.get(i)=='c')
				System.out.print(" 2.0 ");
			if (data.get(i)=='D'||data.get(i)=='d')
				System.out.print(" 1.0 ");
			if (data.get(i)=='F'||data.get(i)=='f')
				System.out.print(" 0.0 ");
			else
				System.out.print("");
		}
		
		
	}

}
