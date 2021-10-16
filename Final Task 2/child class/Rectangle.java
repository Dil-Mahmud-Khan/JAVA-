class Rectangle extends Shape{         //declaring inherit
	private double length;           //declaring variable
	private double width;
	
	
	public  Rectangle(){}            //default constructor
	
	public Rectangle(double length,double width){          //parameterized constructor
		
		this.length=length;
		this.width=width;
	}
	
	
	//setter method and getter method
	public void setLength(double length){this.length=length;}
	public void setWidth(double Width){this.width=width;}
	
	public double getLength(){return length;}
	public double getWidth(){return width;}
	
	
	
	public double area(){               //method to declare area
		double area=length*width;
		return area;
	}
	
	  //method to show details
	public void showDetails(){
		System.out.println("Length is : "+getLength());
		System.out.println("Width is : "+getWidth());
		System.out.println("Area Of Rectangle is : "+area());
	}
}

		
		