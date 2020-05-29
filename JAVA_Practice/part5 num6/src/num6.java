import java.util.*;

abstract class DObject
{
	public DObject next;
	public DObject()
	{next = null;}
	abstract public void draw();
}

class Line extends DObject
{
	public void draw()
	{
		System.out.println("Line");
	}
}
class Rectangle extends DObject
{
	public void draw()
	{
		System.out.println("Rectangle");
	}
}
class Circle extends DObject
{
	public void draw()
	{
		System.out.println("Circle");
	}
}

public class num6 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int button, select,i=1,count=0;
		int objarr[]=new int [10];
		
		Line line = new Line();
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();
		
		while (true)
		{
			System.out.print("(1)삽입  (2)삭제   (3)모두보기   (4)종료 >>>> ");
			button=input.nextInt();
			
			switch(button)
			{
			case 1:
				System.out.println("도형종류");
				System.out.print("(1)Line  (2)Rectangle  (3)Circle >>>> ");
				select=input.nextInt();
				objarr[i]=select;
				i++;
				count++;
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 : ");
				select=input.nextInt();
				if (objarr[select]==select)
				{
					objarr[select]=0;
					System.out.println("삭제되었습니다.");
				}
				else
					System.out.println("삭제 할 수 없습니다."); 
				break;
			case 3:
				for (i=0;i<=count;i++)
				{
					if (objarr[i]==1)
						line.draw();
					if (objarr[i]==2)
						rectangle.draw();
					if (objarr[i]==3)
						circle.draw();
				}
				default:
					break;
			}
		}
	}

}
