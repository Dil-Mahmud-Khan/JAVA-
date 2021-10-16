import java.lang.*;

public class Rectangles extends Shapes{
	private double y;
	
	public Rectangles(){}
	public Rectangles(double x,double y)
	{
		super(x);
		this.y=y;
	}
	public void sety(double y){this.y=y;}
	public double gety(){return y;}
	public double getArea(){
		return  x*y;}
		
	public void ShowDetail(){
	System.out.println("X : " +getx());
	System.out.println("Y : " +gety());
	System.out.println("Area : "+getArea());
	
}
}


	