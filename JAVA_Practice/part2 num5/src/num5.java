import java.util.Scanner;

public class num5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3���� ���� �Է� : ");

		Scanner A = new Scanner(System.in);
		Scanner B = new Scanner(System.in);
		Scanner C = new Scanner(System.in);
		
		int a = A.nextInt();
		int b = B.nextInt();
		int c = C.nextInt();
		
		if ((a+b)>c||(a+c)>b||(b+c)>a)
			System.out.println("�ﰢ���� ���� �մϴ�");
		else
			System.out.println("�ﰢ���� �Ұ� �մϴ�");
	}

}
