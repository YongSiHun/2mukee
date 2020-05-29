import java.util.Scanner;

public class num6
{
	static class System1
	{
		static String [][]seat={
					{"----","----","----","----","----","----","----","----","----","----"},
					{"----","----","----","----","----","----","----","----","----","----"},
					{"----","----","----","----","----","----","----","----","----","----"}};
		static int Reservation()
		{
			Scanner input = new Scanner(System.in);
			Scanner Cinput = new Scanner(System.in);
			System.out.print("좌석등급 선택 (1)S급  (2)A급  (3)B급 >>");
			int seatClass = input.nextInt();				
			
			switch(seatClass)
			{
			case 1:
			{
				System.out.print("S>>");
				for (int i=0;i<seat[0].length;i++)
				{
					System.out.print(seat[0][i]+"  ");
				}
				break;
			}
			case 2:
			{
				System.out.print("A>>");
				for (int i=0;i<seat[1].length;i++)
				{
					System.out.print(seat[1][i]+"  ");
				}
				break;
			}
			case 3:
			{
				System.out.print("B>>");
				for (int i=0;i<seat[2].length;i++)
				{
					System.out.print(seat[2][i]+"  ");
				}
				break;
			}
			default:
				System.out.println("존재하지 않는 좌석 입니다.");
				return 0;
			}
			System.out.println(" ");
			System.out.print("이름입력 >>> ");
			String name = Cinput.nextLine();
			System.out.println(" ");
			System.out.print("좌석번호 : ");
			int seatNum = input.nextInt();
			if (seatClass==1)
			{
				for (int i=0;i<seat[0].length;i++)
				{
					seat[0][seatNum]=name;
				}	
			}
			if (seatClass==2)
			{
				for (int i=0;i<seat[1].length;i++)
				{
					seat[1][seatNum]=name;
				}	
			}
			if (seatClass==3)
			{
				for (int i=0;i<seat[2].length;i++)
				{
					seat[2][seatNum]=name;
				}	
			}
			return 0;
		}
		
		static void SearchSeat()
		{
			int i=1,j=0;
			for (i=0;i<3;i++)
			{
				if (i==0)
					System.out.print("S Class >>>");
				if (i==1)
					System.out.print("A Class >>>");
				if (i==2)
					System.out.print("B Class >>>");
				System.out.println(" ");
				for (j=0;j<10;j++)
				{
					System.out.print(seat[i][j]+" ");
				}
				System.out.println(" ");
			}
			System.out.println(" ");
			System.out.println("<<<<조 회 완 료>>>>");
		}
		
		static void cancle()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("예약자 이름 : ");
			String reserMan = input.nextLine();
			int count=0;
			
			for (int i=0;i<3;i++)
			{
				for (int j=0;j<10;j++)
				{
					if (seat[i][j].equals(reserMan))
					{
						seat[i][j]="----";
						count++;
					}
				}
			}
			if (count==0)
				System.out.println("존재하지 않는 예약자 입니다");
			else
				System.out.println("예약취소되었습니다.");
		}
	}
	
	public static void main(String[] args)
	{
		System1 system = new System1();
		Scanner input = new Scanner(System.in);
		int select=0;
		
		while (select!=4)
		{
			System.out.print("(1)예약  (2)조회  (3)취소  (4)끝내기 >>");
			select=input.nextInt();
			
			switch(select)
			{
			case 1:
				System1.Reservation();
				break;
			case 2:
				System1.SearchSeat();
				break;
			case 3:
				System1.cancle();
				break;
			case 4:
				break;
			default:
				System.out.println("다시 입력하세요 : ");
				break;
			}
		}
		System.out.println("end");
	}
}