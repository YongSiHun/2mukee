import java.util.Scanner;

public class num4 
{
	public static class ArrayUtility2
	{
		public static int count=0;
		
		static int [] concat(int [] s1, int [] s2)
		{
			int[] output=new int [s1.length+s2.length];

			for (int i=0;i<s1.length;i++)
			{
				output[i]=s1[i];
				output[i+s1.length]=s2[i];
			}
			return output;
		}
		
		static int [] remove(int [] s1, int [] s2)
		{
			int[] output=new int [s1.length+s2.length];
			
			for (int i=0;i<s1.length;i++)
			{
				output[i]=s1[i];
			}
			for (int i=0;i<s1.length;i++)
			{
				for (int j=0;j<s2.length;j++)
				{
					if (s1[i]==s2[j])
					{
						output[i]=0;
						count++;
					}
				}
			}
			return output;	
		}
		
		public static void main(String[] args)
		{
			Scanner input=new Scanner(System.in);
			int array1[]=new int [3];
			int array2[]=new int [3];
			int array3[]=new int [array1.length+array2.length];
			int array4[]=new int [array3.length];
			
			for (int i=0;i<array1.length;i++)
			{
				System.out.println("input : ");
				array1[i]=input.nextInt();
			}
			
			for (int i=0;i<array2.length;i++)
			{
				System.out.println("two input : ");
				array2[i]=input.nextInt();
			}
		 	
			array3=ArrayUtility2.concat(array1,array2);
			
			for (int i=0;i<array3.length;i++)
			{
				System.out.print(array3[i]+" ");
			}
			System.out.println(" ");
			
			array4=ArrayUtility2.remove(array1, array2);
			
			for (int i=0;i<array3.length-count;i++)
			{
				if (array4[i]!=0)
				{
					System.out.print(array4[i]+" ");
				}
			}
			System.out.println(" ");
		}
	}
}
