import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("년도를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if (year%4==0||year%400==0)
		{
			if (year%100==0)
			{
				System.out.println("평년 입니다.");
			}
			else
				System.out.println("윤년 입니다.");
		}
		else
			System.out.println("평년 입니다.");
	}

}
