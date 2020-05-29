import java.util.*;

class Location
{
	double lati,longti;
	
	public Location(double lati,double longti)
	{
		this.lati=lati;
		this.longti=longti;
	}
	
	void show()
	{
		System.out.println("( "+lati+" , "+longti+" )");
	}
}

public class num10 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		HashMap<String,Location>map=new HashMap<String,Location>();
		String name;
		double lati,longti;
		
		for (int i=0;i<5;i++)
		{
			System.out.println(" ");
			System.out.print("지명을 입력하시오 : ");
			name = input.next();
			System.out.print("위도를 입력하시오 : ");
			lati = input.nextDouble();
			System.out.print("경도를 입력하시오 : ");
			longti = input.nextDouble();
			Location loc = new Location(lati,longti);
			map.put(name,loc);
		}
		Set<String>key=map.keySet();
		while (true)
		{
			System.out.print("경도와 위도를 확인할 지명을 입력하시오  (e to exit) : ");
			String search = input.next();
			if (search=="e")
				break;
			try
			{
				map.get(search).show();
			}
			catch(Exception e)
			{
				System.out.println("존재하지 않는 지명 입니다.");
			}
		}
	}
}
