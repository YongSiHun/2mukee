import java.util.Scanner;

public class num4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.print("1~99 ������ ������ �Է��Ͻÿ� : ");
      int clap=input.nextInt();
      
      if (clap/10==9||clap/10==6||clap/10==3)
      {
         System.out.printf("�ڼ�¦");
         clap%=10;
         if (clap-9==0||clap-6==0||clap-3==0)
         {
            System.out.printf("¦");
         }
      }
      else if (clap%10==9||clap%10==6||clap%10==3)
      {
         System.out.printf("�ڼ�¦");
         clap/=10;
         if (clap-9==0||clap-6==0||clap-3==0)
         {
            System.out.printf("¦");
         }
      }
   }

}