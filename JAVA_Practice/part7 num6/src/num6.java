import java.util.*;

abstract class GraphicObject
{
	int x,y,w,h;
	GraphicObject(int x,int y,int w,int h)
	{
		this.x=x;
		this.y=y;
		this.w=w;
		this.h=h;
	}
	public abstract void view();
}

class Rect extends GraphicObject
{
	Rect(int x, int y, int w, int h) 
	{
		super(x, y, w, h);
	}

	public void view() 
	{
		System.out.println(x+","+y+"->"+w+","+h+"의 사각형");
	}	
}

class Line extends GraphicObject
{

	Line(int x, int y, int w, int h) 
	{
		super(x, y, w, h);
	}

	public void view() 
	{
		System.out.println(x+","+y+"->"+w+","+h+"의 선");
	}
}

public class num6
{
	Vector<GraphicObject>v=new Vector<GraphicObject>();
	
	void add(GraphicObject ob)
	{
		v.add(ob);
	}
	void draw()
	{
		for (int i=0;i<v.size();i++)
		{
			GraphicObject ob = v.get(i);
			ob.view();
		}
	}
	
	public static void main(String[] args) 
	{
		num6 gra = new num6();
		gra.add(new Rect(2,2,3,4));
		gra.add(new Line(3,3,8,8));
		gra.add(new Line(2,5,6,6));
		gra.draw();
	}
}
