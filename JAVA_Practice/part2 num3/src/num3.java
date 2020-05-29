import java.util.Scanner;

public class num3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("돈을 입력하시오 : ");
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
		
		System.out.printf("오만원권 %d장\n만원권 %d장\n오천원권 %d장\n천원권 %d장\n오백원 %d개\n백원 %d개\n오십원 %d개\n십원 %d개\n1원 %d개\n"
				,oman,man,ochun,chun,obak,bak,osip,sip,il);
		
		

	}

}
