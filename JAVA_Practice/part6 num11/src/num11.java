import java.util.Scanner;

public class num11 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int man;
		
		while(true)
		{
			System.out.print("1.����  2.����  3.��  4.���� >>> ");
			man = input.nextInt();
			int ran = (int)(Math.random()*3+1);
			
			if (man==ran)
				System.out.println("�����ϴ�."+ran);
			if ((ran==1&&man==2)||(ran==2&&man==3)||(ran==3&&man==1))
				System.out.println("����� �̰���ϴ�."+ran);
			if ((ran==1&&man==3)||(ran==2&&man==1)||(ran==3&&man==2))
				System.out.println("����� �����ϴ�."+ran);
			if (man==4)
				break;
		}
		
		
	}

}
