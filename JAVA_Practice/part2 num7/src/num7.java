import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�� x�� y�� ��ǥ�� �Է��Ͻÿ� : ");
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		int a = x.nextInt();
		int b = y.nextInt();
		
		int x1 = 50, y1 = 50;
		int x2 = 100, y2 = 100;
		
		if ((x1<=a&&y1<=b)&&(a<=x2&&b<=y2))
			System.out.println("�簢���ȿ� ���� �ֽ��ϴ�.");
		else
			System.out.println("�簢���ȿ� ���� �����ϴ�");
	}

}
