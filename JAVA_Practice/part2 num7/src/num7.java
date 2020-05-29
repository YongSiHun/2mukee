import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("점 x와 y의 좌표를 입력하시오 : ");
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		int a = x.nextInt();
		int b = y.nextInt();
		
		int x1 = 50, y1 = 50;
		int x2 = 100, y2 = 100;
		
		if ((x1<=a&&y1<=b)&&(a<=x2&&b<=y2))
			System.out.println("사각형안에 점이 있습니다.");
		else
			System.out.println("사각형안에 점이 없습니다");
	}

}
