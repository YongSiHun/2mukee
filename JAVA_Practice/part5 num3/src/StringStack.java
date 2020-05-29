import java.util.*;

interface Stack
{
	int length();
	Object pop();
	boolean push(Object ob);
}

public class StringStack implements Stack
{
	String STACK[];
	int top;

	public StringStack(int SIZE)
	{
		STACK = new String[SIZE];
		top=0;
	}
	
	public int length() 
	{
		return STACK.length;
	}

	public Object pop() 
	{
		if (top==0)
			return null;
		else
			return STACK[--top];
	}

	public boolean push(Object ob) 
	{
		if (top==STACK.length)
			return false;
		STACK[top++]=ob.toString();
		return true;
	}
}

class num3 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int SIZE;
		String data;
		
		System.out.print("������ ũ�⸦ �Է� : ");
		SIZE = input.nextInt();
		Stack S = new StringStack(SIZE);

		for (int i=0;i<S.length();i++)
		{
			System.out.print("�ܾ� �Է� : ");
			S.push(input.next());
		}
		for (int i=0;i<S.length();i++)
			System.out.println(S.pop());
	}

}
