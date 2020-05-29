import java.util.Scanner;

abstract class calc
{
	abstract void setvalue(int a,int b);
	abstract int calculate();
}


class add extends calc
{
	int a;
	int b;
	
	void setvalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int calculate()
	{
		return a+b;
	}
}

class sub extends calc
{
	int a;
	int b;
	
	void setvalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int calculate()
	{
		return a-b;
	}
}

class mul extends calc
{
	int a;
	int b;
	
	void setvalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int calculate()
	{
		return a*b;
	}
}

class div extends calc
{
	int a;
	int b;
	
	void setvalue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	int calculate()
	{
		return a/b;
	}
}


public class num2 
{

	public static void main(String[] args) 
	{
		calc Add = new add();
		calc Sub = new sub();
		calc Mul = new mul();
		calc Div = new div();
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자를 입력하세요 : ");
		int a = input.nextInt();
		int b = input.nextInt();
		char oper = input.next().charAt(0);
		
		switch(oper)
		{
		case '+':
			Add.setvalue(a, b);
			System.out.println(Add.calculate());
			break;
		case '-':
			Sub.setvalue(a, b);
			System.out.println(Sub.calculate());
			break;
		case '*':
			Mul.setvalue(a, b);
			System.out.println(Mul.calculate());
			break;
		case '/':
			Div.setvalue(a, b);
			System.out.println(Div.calculate());
			break;
			default:
				System.out.println("다시 입력하시오 ");
		}
	}
}
