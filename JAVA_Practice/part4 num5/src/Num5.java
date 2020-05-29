import java.util.Scanner;
 

	class Add
	{
		int a,b;
 
		public void setValue(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
		public int calculate()
		{
			return a+b;
		}
	}
	class Sub
	{
		int a,b;
 
		public void setValue(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
 
		public int calculate()
		{
			return a-b;
		}
	}
	class Mul
	{
		int a,b;
 
		public void setValue(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
 
		public int calculate()
		{
			return a*b;
		}
	}
	class Div
	{
		int a,b;
 
		public void setValue(int a,int b)
		{
			this.a=a;
			this.b=b;
		}
 
		public int calculate()
		{
			return a/b;
		}
	}
	public class Num5
	{
		public static void main(String[] args)
		{ 
			int a,b;
			Scanner input = new Scanner(System.in);
			Add add = new Add();
			Sub sub = new Sub();
			Mul mul = new Mul();
			Div div = new Div();
	 
			System.out.print("두 정수와 연산자를 입력하세요 >> ");
			a=input.nextInt();
			b=input.nextInt();
			char c=input.next().charAt(0);
	 
			switch (c)
			{
			case '+':
				add.setValue(a,b);
				System.out.print(add.calculate());
				break;
			case '-':
				sub.setValue(a,b);
				System.out.print(sub.calculate());
				break;
			case '*':
				mul.setValue(a,b);
				System.out.print(mul.calculate());
				break;
			case '/':
				div.setValue(a,b);
				System.out.print(div.calculate());
				break;
			default :
				System.out.println("잘못된 입력입니다. ");
			}
		}	
	}