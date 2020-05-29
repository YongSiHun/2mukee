import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[10];
		int dummy=0;
		
		for(int i=0;i<10;i++)
		{
			System.out.print("정수를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			array[i]=input.nextInt();
		}
		
		for (int i=1;i<10;i++)
		{
			for (int j=1;j<10;j++)
			{
				if (array[j]<=array[j-1])
				{
					dummy=array[j];
					array[j]=array[j-1];
					array[j-1]=dummy;
				}
			}

		}
		
		for (int i=0;i<10;i++)
		{
			System.out.print(+array[i]+" ");
		}

	}

}
