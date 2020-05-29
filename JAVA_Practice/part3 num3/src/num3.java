import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("0 보다큰 정수를 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		int binary = input.nextInt();
		int array[]=new int[32];
		int size=array.length;
		int count=0;
		
		for (int i=0;i<=size-1;i++)
		{
			if (binary%2==1)
			{
				array[i]=1;
				count++;
			}
			else if (binary%2==0)
			{
				array[i]=0;
			}
			binary/=2;
		}
		for (int i=31;i>=0;i--)
		{
			System.out.print(+array[i]);
		}
		System.out.println(" ");
		System.out.print("1의 갯수 = "+count);
	}

}
