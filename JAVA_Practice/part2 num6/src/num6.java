import java.util.Scanner;

public class num6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�⵵�� �Է��ϼ��� : ");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		
		if (year%4==0||year%400==0)
		{
			if (year%100==0)
			{
				System.out.println("��� �Դϴ�.");
			}
			else
				System.out.println("���� �Դϴ�.");
		}
		else
			System.out.println("��� �Դϴ�.");
	}

}
