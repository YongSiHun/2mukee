import java.util.Scanner;

public class num11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���� �Է��Ͻÿ� : ");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		int [] output = new int [8];
		
		for (int i=0;i<8;i++)
		{
			output[i] = money/unit[i];
			money%=unit[i];
		}
		
		System.out.print("��������      ������     õ����      �������      �����      ���ʿ���      �ʿ���      �Ͽ���");
		System.out.println(" ");
		
		for (int i=0;i<8;i++)
		{
			System.out.print(+output[i]+"       ");
		}
		

	}

}
