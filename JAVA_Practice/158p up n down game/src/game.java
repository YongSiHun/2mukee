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
				System.out.println("���� �����Ͽ����ϴ�. ���߾� ������.");
				System.out.println("0~99");
			}

			System.out.print(">> ");
			num = input.nextInt();
			
			if (num<k)
			{
				System.out.println("�� ����");
				continue;
			}
			if (num>k)
			{
				System.out.println("�� ����");
				continue;
			}
			if (num==k)
			{
				System.out.println("����!!!");
				System.out.print("�����Ͻðڽ��ϱ�? y/n?");
				ex = exit.next().charAt(0);
				num=0;
				
				if (exit.next().equals("y"))
					break;
			}
		}
	}

}
