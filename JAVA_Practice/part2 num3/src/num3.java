import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("���� �Է��Ͻÿ� : ");
		int money=input.nextInt();
		int oman=money/50000;
		money=money%50000;
		int man=money/10000;
		money=money%10000;
		int ochun=money/5000;
		money=money%5000;
		int chun=money/1000;
		money=money%1000;
		int obak=money/500;
		money=money%500;
		int bak=money/100;
		money=money%100;
		int osip=money/50;
		money=money%50;
		int sip=money/10;
		money=money%10;
		int il=money;
		
		System.out.printf("�������� %d��\n������ %d��\n��õ���� %d��\nõ���� %d��\n����� %d��\n��� %d��\n���ʿ� %d��\n�ʿ� %d��\n1�� %d��\n"
				,oman,man,ochun,chun,obak,bak,osip,sip,il);
		
		

	}

}
