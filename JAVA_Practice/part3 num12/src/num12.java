import java.util.Scanner;

public class num12 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		for (int i=1;i<100;i++)
		{
			if ((i%10==3||i%10==6||i%10==9)||(i/10==3||i/10==6||i/10==9))
			{
				if ((i%10==3||i%10==6||i%10==9)&&(i/10==3||i/10==6||i/10==9))
				{
	
					System.out.print(+i+" 박수 두번");
					System.out.println(" ");
				}
				else
				{
					System.out.print(+i+" 박수 한번");
					System.out.println(" ");
				}
			}	
		}
	}
}
