package project;

import java.util.Comparator;

public class MyClass implements Comparator <Student>
{
public int compare(Student s1,Student s2)
{
if(s1.getCgpa()<s2.getCgpa())
{
	return 1;
}
else if(s1.getCgpa()>s2.getCgpa())
{
	return -1;
}
else

	{
	if(s1.getName().compareTo(s2.getName())>1)
	{
	return 1;
	}
	else if(s1.getName().compareTo(s2.getName())<1)
		
	{
		return -1;
	}
	else{if(s1.getId()>s2.getId())
	{
		return 1;
	}
	else if(s1.getId()<s2.getId())
		{
		return -1;
		}
		
	}
	}
return 0;
}
}
