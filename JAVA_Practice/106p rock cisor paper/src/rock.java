import java.util.Scanner;

public class rock 
{
	public static void main(String[] args) 
	{
		Scanner out = new Scanner(System.in);
		Scanner name_1 = new Scanner(System.in);
		Scanner name_2 = new Scanner(System.in);
		System.out.print("ù��° ����� �̸��� �Է��Ͻÿ� : ");
		String name1 = name_1.nextLine();
		System.out.print("�ι�° ����� �̸��� �Է��Ͻÿ� : ");
		String name2 = name_2.nextLine();
		int outing=1;
		
		while(outing!=0)
		{
			System.out.print(name1+">>");
			String var1 = name_1.nextLine();
			System.out.print(name2+">>");
			String var2 = name_2.nextLine();
			
			if (var1.equals("����"))
			{
				if (var2.equals("����"))
					System.out.println("�����ϴ�.");
				if (var2.equals("����"))
					System.out.println(name2+"(��)�� �̰���ϴ�.");
				if (var2.equals("��"))
					System.out.println(name1+"(��)�� �̰���ϴ�.");
			}
			if (var1.equals("����"))
			{
				if (var2.equals("����"))
					System.out.println(name1+"(��)�� �̰���ϴ�.");
				if (var2.equals("����"))
					System.out.println("�����ϴ�.");
				if (var2.equals("��"))
					System.out.println(name2+"(��)�� �̰���ϴ�.");
			}
			if (var1.equals("��"))
			{
				if (var2.equals("����"))
					System.out.println(name2+"(��)�� �̰���ϴ�.");
				if (var2.equals("����"))
					System.out.println(name1+"(��)�� �̰���ϴ�.");
				if (var2.equals("��"))
					System.out.println("�����ϴ�.");
			}
			System.out.println("����Ͻðڽ��ϱ�? 1. ��   0. �ƴϿ�  : ");
			outing = out.nextInt();
			
		
		}

		
		
		

	}

}
