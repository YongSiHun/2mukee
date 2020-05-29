import java.util.Scanner;
import java.io.*;

class Person
{
	String name;

	public Person(String name)
	{
		this.name=name;
	}
	
	String getName()
	{
		return name;
	}
}

public class num12 
{

	public static void main(String[] args) 
	{
		Person one,two,player=null;
		Scanner name = new Scanner(System.in);
		Scanner enter = new Scanner(System.in);
		int num[]=new int[3];
		int count=0;
		String ent;
		
		System.out.print("첫 번째 진행자의 이름을 입력하시오 : ");
		one=new Person(name.nextLine());
		System.out.print("두 번째 진행자의 이름을 입력하시오 : ");
		two=new Person(name.nextLine());
		player=one;
		
		while(true)
		{
			while (true)
			{
				System.out.println(player.getName()+"의 차례 입니다. Enter키 입력");
				ent=enter.nextLine();
				if (ent.isEmpty())
					break;
			}
			System.out.print(player.getName()+"님의 숫자 = ");
			for (int i=0;i<3;i++)
			{
				num[i]=(int)(Math.random()*3+1);
				System.out.print(num[i]+"  ");
			}
			System.out.println();
			for(int i=0;i<2;i++)
			{
				if (num[0]==num[i])
					count++;
			}
			if (count==3)
			{
				System.out.println(player.getName()+"님이 이겼습니다.");
				break;
			}
			if (player==one)
				player=two;
			else
				player=one;
		}
	}
}
