import java.util.Scanner;

public class maine
{
	public static void main(String[] args)
	{
		int menu,print,output=1,remain=100;
		
		inkjet ink = new inkjet();
		raiser ras = new raiser();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("프린터를 선택하시오");
		System.out.println("1.잉크젯 프린터   2.레이저 프린터 ");
		System.out.print(">>>");
		print=input.nextInt();
		System.out.print("");
		
		while (true)
		{
			System.out.println("메뉴를 선택하시오 ");
			System.out.println("1.프린터 출력   2.잔량확인   3.인쇄지추가   4.종료");
			System.out.print(">>>  ");
			menu=input.nextInt();
			
			switch(menu)
			{
			case 1:
				if (print==1)
				{
					remain--;
					output--;
					ink.print("SAM-572","삼성","USB",remain,output);
					ink.output();
				}
				else if (print==2)
				{
					ras.print("HP-899","HP","USB",remain,output);
					ras.output();
				}					
				
			}
		}

	}
}

class printer {
	String Model_name;
	String Maker;
	String intface;
	int output;
	int remain;
	
	void print(String name,String maker, String intface, int remain, int output)
	{
		this.Model_name = name;
		this.Maker = maker;
		this.intface = intface;
		this.output = output;
		this.remain = remain;		
	}
	void output()
	{
		output++;
		remain--;
		System.out.println("인쇄용지"+output+"남은 매수"+remain);
	}
}

class inkjet extends printer
{
	int inkremain;
	
	void print(int inkremain)
	{
		this.inkremain=inkremain;
	}
	
	void output()
	{
		output++;
		remain--;
		System.out.println("인쇄용지"+output+"남은 매수"+remain+"남은잉크"+inkremain);
	}
}

class raiser extends printer
{
	int tonerremain;
	
	void print(int tonerremain)
	{
		this.tonerremain=tonerremain;
	}
	
	void output()
	{
		output++;
		remain--;
		System.out.println("인쇄용지"+output+"남은 매수"+remain+"남은토너"+tonerremain);
	}
}


