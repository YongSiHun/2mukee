import java.util.Scanner;

public class num4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("첫번째 수를 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		if (num1==0)
		{
			System.out.println("GCD = "+num2);
		}
		while(num2!=0)
		{
			if (num1>num2)
			{
				num1-=num2;
				
			}
			else
			{
				num2-=num1;
			}
		}
		int gcd=num1;
		
		System.out.print("최대 공약수 = "+gcd);
	}
}
