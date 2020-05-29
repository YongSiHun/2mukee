import java.util.*;

class Student
{
	String name;
	String Depart;
	String id;
	Double average;
	
	void Student (String name, String Depart, String id, Double average)
	{
		this.name=name;
		this.Depart=Depart;
		this.id=id;
		this.average=average;
	}
	String getName()
	{
		return name;
	}
	String getDepart()
	{
		return Depart;
	}
	String getid()
	{
		return id;
	}
	double getAverage()
	{
		return average;
	}
}

public class num5
{
	public static void main(String[] args) 
	{
		ArrayList<Student>student=new ArrayList<Student>();
		Scanner input = new Scanner(System.in);
		Student info = new Student();
		String name,Depart,id;
		double average;
		
		while (true)
		{
			System.out.print("이름을 입력하세요 : ");
			name=input.next();
			System.out.print("학과를 입력하세요 : ");
			Depart = input.next();
			System.out.print("학번을 입력하세요 : ");
			id = input.next();
			System.out.print("학점 평균을 입력하세요 : ");
			average = input.nextDouble();
			info.Student(name, Depart, id, average);
			student.add(info);
			
			System.out.print("입력을 그만두려면 0을 입력 계속하려면 아무거나 입력");
			int stop=input.nextInt();
			if (stop==0)
				break;
		}
		Iterator<Student>it=student.iterator();
		while(it.hasNext())
		{
			Student st = it.next();
			if (st!=null)
			{
				System.out.println("이름 : "+st.getName());
				System.out.println("학과 : "+st.getDepart());
				System.out.println("학번 : "+st.getid());
				System.out.println("학점평균 : "+st.getAverage());
			}
		}
	}
}
