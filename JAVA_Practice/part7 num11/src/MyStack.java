import java.util.*;

interface Stack<T>
{
	T pop();
	boolean push(T ob);
}


public class MyStack<T> implements Stack<T>
{
	LinkedList<T>l=null;
	int top=-1;
	public MyStack()
	{
		l=new LinkedList<T>();
	}
	
	public T pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is Empty");
			return null;	
		}
		else
		{
			System.out.println("Pop Success!!");		
			System.out.println("Pop된 data = "+l.get(top));
			return l.remove(top--);
		}
	}
	
	public boolean push(T ob)
	{
		top++;
		System.out.println("Push Success!!");
		return l.add(ob);
	}
	public static void main(String[] args) 
	{
		Stack<Integer>sta = new MyStack<Integer>();
		Scanner scan = new Scanner(System.in);
		MyStack istack = new MyStack();
		int menu=0,data;
		
		while(menu!=3)
		{
			System.out.println("");
			System.out.print("1.push  2.pop  3.exit : ");
			menu=scan.nextInt();
			
			switch(menu)
			{
			case 1:
				System.out.print("push할 데이터를 입력하시오 : ");
				data=scan.nextInt();
				istack.push(data);
				break;
			case 2:
				istack.pop();
				break;
			case 3:
				System.out.println("종료합니다");
				break;
				default:
					System.out.println("잘못된 입력 입니다.");
					break;
			}
		}
		
	}

}
