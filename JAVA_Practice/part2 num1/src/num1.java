import java.util.Scanner;

public class num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("������ �� �ڸ� �Է��ϼ��� : ");
		char ch = input.next().charAt(0);
		if ('A'<=ch&&ch<='Z')
		{
			ch=(char) (ch+32);
			System.out.println(ch);
		}
		else if ('a'<=ch&&ch<='z')
		{
			ch=(char) (ch-32);
			System.out.println(ch);
		}
		else
		{
			System.out.println("�����ڰ� �ƴմϴ�");
		}
	}

}
