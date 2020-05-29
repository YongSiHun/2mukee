import java.util.*;

class Student
{
	String name,depart,id,average;
	
	public Student(String name,String depart, String id,String average)
	{
		this.name=name;
		this.depart=depart;
		this.id=id;
		this.average=average;
	}
	public Student() {}
	void setinfo(String name,String depart, String id,String average)
	{
		this.name=name;
		this.depart=depart;
		this.id=id;
		this.average=average;
	}
	
	void show()
	{
		System.out.println("이름 : "+name);
		System.out.println("학과 : "+depart);
		System.out.println("학번 : "+id);
		System.out.println("학점평균 : "+average);
	}
}

public class num9 
{
	public static void main(String[] args) 
	{
		Student info = new Student();
		HashMap<String,Student>dept=new HashMap<String,Student>();
		Scanner input = new Scanner(System.in);
		String data[]=new String[4];

		for (int j=0;j<5;j++)
		{
			for (int i=0;i<4;)
			{
				System.out.print("이름을 입력하시오 : ");
				data[i++]=input.next();
				System.out.print("학과를 입력하시오 : ");
				data[i++]=input.next();
				System.out.print("학번을 입력하시오 : ");
				data[i++]=input.next();
				System.out.print("학점 평균을 입력하시오 : ");
				data[i++]=input.next();
				
				info.setinfo(data[0], data[1], data[2], data[3]);
				
				Student temp = new Student (data[0], data[1], data[2], data[3]);
				
				dept.put(data[2], temp);
			}
		}
		Set<String>key=dept.keySet();
		Iterator<String>it=key.iterator();
		
		while(true)
		{
			System.out.print("검색할 학생의 학번을 입력하시오 (e = exit) : ");
			String search = input.next();
			if (search=="e")
				break;
			try
			{
				dept.get(search).show();
			}
			catch(Exception e)
			{
				System.out.println("존재하지 않는 학생 입니다.");
			}
		}

	}
}

