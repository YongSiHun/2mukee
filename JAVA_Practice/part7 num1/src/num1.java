import java.util.*;


public class num1 
{

	public static void main(String[] args) 
	{
		double D;
		Scanner input = new Scanner(System.in);
		
		Vector<Double> vc = new Vector<Double>();
		
		for (int i=0;i<10;i++)
		{
			System.out.print("실수값 입력 : ");
			D=input.nextDouble();
			vc.add(D);
		}
		for (int i=0;i<10;i++)
		{
			Double obj = vc.get(i);
			double num = obj.doubleValue();
			System.out.print(num+" ");
		}
	}

}
