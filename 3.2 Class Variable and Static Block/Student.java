
    import java.lang.*;
public class Student 
{​​​
	private int id;	
    private String name;
    private double cgpa;
	
	public Student()
	{​​​
		System.out.println("Empty - Student");
	}​​​
	public Student(int id, String name, double cgpa)
	{​​​
		System.out.println("Para - Student");
		this. id = id ;
		this.name = name;
		this.cgpa = cgpa;
	}​​​
	
    public void setID(int id)
    {​​​
        this.id=id;
    }​​​
    public void setName(String name)
    {​​​
        this.name=name;
    }​​​
    public void setCGPA(double cgpa)
    {​​​
        this.cgpa=cgpa;
    }​​​
	
    public int getID()
    {​​​
        return id;
    }​​​
    public String getName()
    {​​​
        return name;
    }​​​
	
    public double getCGPA()
    {​​​
        return cgpa;
    }​​​
	
	public void showDetails()
	{​​​
import java.lang.*;
public class Start
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setID(9999);
		s1.setName("Tripti");
		s1.setCGPA(3.50);
			
		System.out.println("Student ID is: "+s1.id());
		System.out.println("Student Name is: "+s1.name());
		System.out.println("Cgpa is: "+s1.cgpa());
		
		Student s2 = new Student(9998, "Sokina", 3.35);
		s2.showDetails();
		
	}
}