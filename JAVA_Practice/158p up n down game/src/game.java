import java.util.Scanner;
import java.util.Random;

public class game 
{	
	public static void main(String[] args) 
	{
		Random r=new Random();
		int k=r.nextInt(100);
		int num=0;
		Scanner input = new Scanner(System.in);
		Scanner exit = new Scanner(System.in);
		char ex = 'n';

		for (;;)
		{
			if (num==0)
			{
				System.out.println("수를 결정하였습니다. 맞추어 보세요.");
				System.out.println("0~99");
			}

			System.out.print(">> ");
			num = input.nextInt();
			
			if (num<k)
			{
				System.out.println("더 높게");
				continue;
			}
			if (num>k)
			{
				System.out.println("더 낮게");
				continue;
			}
			if (num==k)
			{
				System.out.println("정답!!!");
				System.out.print("종료하시겠습니까? y/n?");
				ex = exit.next().charAt(0);
				num=0;
				
				if (exit.next().equals("y"))
					break;
			}
		}
	}

}
