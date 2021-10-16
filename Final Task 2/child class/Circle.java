public class Circle extends Shape{//declaring inherit
	
	private double radious;      //declaring variable    
	
	public Circle(){}                //default constructor 
	
	public Circle(double radious){               //parameterized constructor
		this.radious=radious;
	}
	
	
	//setter method and getter method
	public void setRadious(double radious){
		this.radious=radious;}
	public double getRadious(){return radious;}
	
	
	public double area(){                         //method to declare area 
		 double area=3.1416*radious*radious;
		return area;
	}
	
	  //method to show details
	public void showDetails(){
		
		System.out.println("The area of Circle : "+area());
	}
}

	