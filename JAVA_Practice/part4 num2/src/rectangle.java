import java.util.Scanner;

public class rectangle
{
	int x1,y1,x2,y2;
	
	public rectangle()
	{
	}
	
	public rectangle(int x1,int y1,int x2, int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	void set(int x1,int y1,int x2, int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	int square()
	{
		int size=((x1>x2?x1-x2:x2-x1)*(y1>y2?y1-y2:y2-y1));
		return size;
	}
	
	void show()
	{
		System.out.println("사각형의 좌표 : ("+x1+","+y1+"),("+x2+","+y2+")");
		System.out.println("사각형의 넓이 : "+square());
	}
	
	boolean equals (rectangle r)
	{
		int width1,height1,width2,height2;
		
		width1=(this.x1>this.x2?this.x1-this.x2:this.x2-this.x1);
		height1=(this.y1>this.y2?this.y1-this.y2:this.y2-this.y1);
		width2=(x1>x2?x1-x2:x2-x1);
		height2=(y1>y2?y1-y2:y2-y1);
		
		if (width1==width2&&height1==height2)
			return true;
		else
			return false;
	}
	
	
	public static void main(String args[])
	{
		rectangle r = new rectangle();
		rectangle s = new rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		r.set(-2,2,-1,4);
		r.show();
		System.out.println(r.square());
		if (r.equals(s))
			System.out.println("두 사각형은 같습니다.");
	}
}

