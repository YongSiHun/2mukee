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
			System.out.print("�̸��� �Է��ϼ��� : ");
			name=input.next();
			System.out.print("�а��� �Է��ϼ��� : ");
			Depart = input.next();
			System.out.print("�й��� �Է��ϼ��� : ");
			id = input.next();
			System.out.print("���� ����� �Է��ϼ��� : ");
			average = input.nextDouble();
			info.Student(name, Depart, id, average);
			student.add(info);
			
			System.out.print("�Է��� �׸��η��� 0�� �Է� ����Ϸ��� �ƹ��ų� �Է�");
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
				System.out.println("�̸� : "+st.getName());
				System.out.println("�а� : "+st.getDepart());
				System.out.println("�й� : "+st.getid());
				System.out.println("������� : "+st.getAverage());
			}
		}
	}
}
