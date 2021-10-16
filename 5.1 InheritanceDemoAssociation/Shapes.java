import java.lang.*;

public class Shapes{
	protected double x;
	
	public Shapes(){
		System.out.println("Empty Constructor");
	}
	
	public Shapes(double x){
		this.x=x;
		System.out.println("This is a parameterized Constructor");
	}
	
	public void Setx(double x){this.x=x;}
	public double getx(){return x;}
	public double getarea(){return -2-2;}
	
	public void ShowDetail(){
		System.out.println("No Shape Right now");
	}
}

	