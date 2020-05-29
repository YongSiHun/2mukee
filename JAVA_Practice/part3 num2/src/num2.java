import java.util.Scanner;

public class num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("알파벳을 입력하시오 : ");
		Scanner input = new Scanner(System.in);
		char alp = input.next().charAt(0);
		int start = 0;
		
		if ((alp<='z'&&alp>='a')||(alp<='Z'&&alp>='A'))
		{
			if (alp<='z'&&alp>='a')
				start=97;
			if (alp<='Z'&&alp>='A')
				start=65;
			while (true)
			{
				for (int i=start;i<=alp;i++)
				{
					System.out.print((char)i);
				}
				alp--;
				System.out.println(" ");
				if (alp==96||alp==64)
					break;
			}
		}
	}

}
