import java.util.*;

public class num3 
{

	public static void main(String[] args) 
	{
		HashMap<String,Integer>nations=new HashMap<String,Integer>();
		Scanner nam = new Scanner(System.in);
		Scanner pop = new Scanner(System.in);
		String name;
		int population;
		
		for (int i=0;i<3;i++)
		{
			System.out.print("나라이름을 입력하시오 : ");
			name=nam.next();
			System.out.print("인구수를 입력하시오 : ");
			population = pop.nextInt();
			nations.put(name, population);
		}

		Scanner search = new Scanner(System.in);
		for (int i=0;i<nations.size();i++)
		{
			System.out.print("나라이름 입력 : ");
			String name_key=search.next();
			System.out.println(nations.get(name_key));
		}
	}
}
