package project;


import java.util.*;

public class Input {

	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t=s.nextInt();
		List<Student> l=new ArrayList<Student>();
		while(t>0)
		{
		int id=s.nextInt();
		String name=s.next();
		double cgpa=s.nextDouble();
		Student s1=new Student(id,name,cgpa);
		l.add(s1);
		t--;
		}
		
		Collections.sort(l,new MyClass());
				for(Student s2:l)
				{
					System.out.println(s2.getName());
				}
	}

}	
