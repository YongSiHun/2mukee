import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정수 입력 : ");
		Scanner input = new Scanner(System.in);
		int max=input.nextInt();

	while (max!=0)
		{
		max--;
			for(int j=0;j<=max;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
