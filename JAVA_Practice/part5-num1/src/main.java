public class main
{
	public static void main(String[] args)
	{
		inkjet ink = new inkjet();
		raiser ras = new raiser();
		
		ink.print("inkman","samsung","USB",10,10);
		ink.output();
		ras.print("rasman","LG","embas",10,10);
		ras.output();
		
	}
}

class printer {
	String Model_name;
	String Maker;
	String intface;
	int number;
	int remain;
	
	void print(String name,String maker, String intface, int number, int remain)
	{
		this.Model_name = name;
		this.Maker = maker;
		this.intface = intface;
		this.number = number;
		this.remain = remain;		
		
		number--;
		remain--;
	}
	
	void output()
	{
		System.out.println("인쇄용지"+number+"남은 매수"+remain);
	}
}

class inkjet extends printer
{
	int inkremain;
}

class raiser extends printer
{
	int tonerremain;
}


