import java.util.Scanner;

public class rock 
{
	public static void main(String[] args) 
	{
		Scanner out = new Scanner(System.in);
		Scanner name_1 = new Scanner(System.in);
		Scanner name_2 = new Scanner(System.in);
		System.out.print("첫번째 사용자 이름을 입력하시오 : ");
		String name1 = name_1.nextLine();
		System.out.print("두번째 사용자 이름을 입력하시오 : ");
		String name2 = name_2.nextLine();
		int outing=1;
		
		while(outing!=0)
		{
			System.out.print(name1+">>");
			String var1 = name_1.nextLine();
			System.out.print(name2+">>");
			String var2 = name_2.nextLine();
			
			if (var1.equals("가위"))
			{
				if (var2.equals("가위"))
					System.out.println("비겼습니다.");
				if (var2.equals("바위"))
					System.out.println(name2+"(이)가 이겼습니다.");
				if (var2.equals("보"))
					System.out.println(name1+"(이)가 이겼습니다.");
			}
			if (var1.equals("바위"))
			{
				if (var2.equals("가위"))
					System.out.println(name1+"(이)가 이겼습니다.");
				if (var2.equals("바위"))
					System.out.println("비겼습니다.");
				if (var2.equals("보"))
					System.out.println(name2+"(이)가 이겼습니다.");
			}
			if (var1.equals("보"))
			{
				if (var2.equals("가위"))
					System.out.println(name2+"(이)가 이겼습니다.");
				if (var2.equals("바위"))
					System.out.println(name1+"(이)가 이겼습니다.");
				if (var2.equals("보"))
					System.out.println("비겼습니다.");
			}
			System.out.println("계속하시겠습니까? 1. 예   0. 아니오  : ");
			outing = out.nextInt();
			
		
		}

		
		
		

	}

}
