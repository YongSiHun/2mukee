import java.util.Scanner;

public class num8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�� ���� ��ǥ�� �Է��Ͻÿ�. x1,y1 / x2,y2");
		Scanner x1 = new Scanner(System.in);
		Scanner y1 = new Scanner(System.in);
		Scanner x2 = new Scanner(System.in);
		Scanner y2 = new Scanner(System.in);
		
		int onex = 50, oney = 50;
		int twox = 100, twoy = 100;
		
		int X1=x1.nextInt();
		int Y1=y1.nextInt();
		int X2=x2.nextInt();
		int Y2=y2.nextInt();
		
		if (((X1<=onex&&Y1<=oney)||(X1<=twox&&Y1<=twoy))||((X2<=onex&&Y2<=oney)||(X2<=twox&&Y2<=twoy)))
				System.out.println("�簢���� ��Ĩ�ϴ�");
		else
			System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");		
	}

}
