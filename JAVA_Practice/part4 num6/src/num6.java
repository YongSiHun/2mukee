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
			System.out.print("�¼���� ���� (1)S��  (2)A��  (3)B�� >>");
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
				System.out.println("�������� �ʴ� �¼� �Դϴ�.");
				return 0;
			}
			System.out.println(" ");
			System.out.print("�̸��Է� >>> ");
			String name = Cinput.nextLine();
			System.out.println(" ");
			System.out.print("�¼���ȣ : ");
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
			System.out.println("<<<<�� ȸ �� ��>>>>");
		}
		
		static void cancle()
		{
			Scanner input = new Scanner(System.in);
			System.out.print("������ �̸� : ");
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
				System.out.println("�������� �ʴ� ������ �Դϴ�");
			else
				System.out.println("������ҵǾ����ϴ�.");
		}
	}
	
	public static void main(String[] args)
	{
		System1 system = new System1();
		Scanner input = new Scanner(System.in);
		int select=0;
		
		while (select!=4)
		{
			System.out.print("(1)����  (2)��ȸ  (3)���  (4)������ >>");
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
				System.out.println("�ٽ� �Է��ϼ��� : ");
				break;
			}
		}
		System.out.println("end");
	}
}