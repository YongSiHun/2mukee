import java.util.Scanner;

public class num7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][]=new int [4][4];
		
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				array[i][j] =(int) Math.round(Math.random()*9+1);
			}
		}
		for (int i=0;i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				System.out.print(+array[i][j]+"  ");
			}
			System.out.println(" ");
		}
	}
}
