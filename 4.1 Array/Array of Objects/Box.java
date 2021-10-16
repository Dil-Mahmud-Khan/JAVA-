import java.lang.*;

public class Box

{
		
	
	private double length;
	private double width;
	private double height;
		
	public Box(double l, double w, double h){
		length=l;
		width=w;
		height=h;
	}
	
	public void setLength(double l)
	{
		length = l;
	}
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getLength(){return length;}
	public double getWidth(){return width;}
	public double getHeight(){return height;}	
	
	public void showBox(){
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);
		System.out.println("Height : "+height);
	}
	
}