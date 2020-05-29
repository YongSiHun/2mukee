import java.util.Scanner;

public class num4 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner input=new Scanner(System.in);
      System.out.print("1~99 사이의 정수를 입력하시오 : ");
      int clap=input.nextInt();
      
      if (clap/10==9||clap/10==6||clap/10==3)
      {
         System.out.printf("박수짝");
         clap%=10;
         if (clap-9==0||clap-6==0||clap-3==0)
         {
            System.out.printf("짝");
         }
      }
      else if (clap%10==9||clap%10==6||clap%10==3)
      {
         System.out.printf("박수짝");
         clap/=10;
         if (clap-9==0||clap-6==0||clap-3==0)
         {
            System.out.printf("짝");
         }
      }
   }

}