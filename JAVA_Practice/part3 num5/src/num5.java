import java.util.Scanner;

public class num5 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int array[]=new int[10];
		
		for (int i=0;i<10;i++)
		{
			System.out.print("������ �Է��ϼ��� : ");
			Scanner input = new Scanner(System.in);
			array[i]=input.nextInt();
		}
		
		for (int i=0;i<10;i++)
		{
			if (array[i]%3==0)
				System.out.println(+array[i]);
		}
	}

}
