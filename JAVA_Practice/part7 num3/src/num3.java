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
			System.out.print("�����̸��� �Է��Ͻÿ� : ");
			name=nam.next();
			System.out.print("�α����� �Է��Ͻÿ� : ");
			population = pop.nextInt();
			nations.put(name, population);
		}

		Scanner search = new Scanner(System.in);
		for (int i=0;i<nations.size();i++)
		{
			System.out.print("�����̸� �Է� : ");
			String name_key=search.next();
			System.out.println(nations.get(name_key));
		}
	}
}
