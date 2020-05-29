import java.lang.reflect.Array;
import java.util.Scanner;

public class arrayutility
{
	static double[] intToDouble(int [] source)
	{
		double Darray[] = new double[source.length];
		for (int i=0;i<Darray.length;i++)
		{
			Darray[i]=(double)source[i];
			System.out.print(Darray[i]+" ");
		}
		System.out.println(" ");
		return Darray;
	}
	
	static int[] doubleToInt(double [] source)
	{
		int Iarray[] = new int [source.length];
		for (int i=0;i<Iarray.length;i++)
		{
			Iarray[i]=(int)source[i];
			System.out.print(Iarray[i]+" ");
		}
		System.out.println(" ");
		return Iarray;
	}
	
	public static void main(String[] args)
	{
		int iarray[]=new int [3];
		Scanner input = new Scanner(System.in);
		
		for (int i=0;i<iarray.length;i++)
		{
			System.out.println("input : ");
			iarray[i]=input.nextInt();
		}
		intToDouble(iarray);
		
		double darray[]=new double [3];
		
		for (int i=0;i<darray.length;i++)
		{
			System.out.println("input : ");
			darray[i]=input.nextDouble();
		}
		doubleToInt(darray);		
	}
}