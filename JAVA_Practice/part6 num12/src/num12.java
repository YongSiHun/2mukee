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
		
		System.out.print("ù ��° �������� �̸��� �Է��Ͻÿ� : ");
		one=new Person(name.nextLine());
		System.out.print("�� ��° �������� �̸��� �Է��Ͻÿ� : ");
		two=new Person(name.nextLine());
		player=one;
		
		while(true)
		{
			while (true)
			{
				System.out.println(player.getName()+"�� ���� �Դϴ�. EnterŰ �Է�");
				ent=enter.nextLine();
				if (ent.isEmpty())
					break;
			}
			System.out.print(player.getName()+"���� ���� = ");
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
				System.out.println(player.getName()+"���� �̰���ϴ�.");
				break;
			}
			if (player==one)
				player=two;
			else
				player=one;
		}
	}
}
