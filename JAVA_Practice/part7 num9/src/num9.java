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
		System.out.println("�̸� : "+name);
		System.out.println("�а� : "+depart);
		System.out.println("�й� : "+id);
		System.out.println("������� : "+average);
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
				System.out.print("�̸��� �Է��Ͻÿ� : ");
				data[i++]=input.next();
				System.out.print("�а��� �Է��Ͻÿ� : ");
				data[i++]=input.next();
				System.out.print("�й��� �Է��Ͻÿ� : ");
				data[i++]=input.next();
				System.out.print("���� ����� �Է��Ͻÿ� : ");
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
			System.out.print("�˻��� �л��� �й��� �Է��Ͻÿ� (e = exit) : ");
			String search = input.next();
			if (search=="e")
				break;
			try
			{
				dept.get(search).show();
			}
			catch(Exception e)
			{
				System.out.println("�������� �ʴ� �л� �Դϴ�.");
			}
		}

	}
}

