class Box{
	//instance variables/properties/attributes
	//accessModifiers dataType VariableName;
	private int length;
	private int width;
	private int height;
	private String color;
	
	//class variables
	//class variables is declared as
	
	//Constructor
	//Constructor does not have any returnType
	//Constructor name is as same as ClassName
	//we may or may not use parameterList
	//if we want to use the constructor from outside of the class
	// we have to use public accessModifiers
	//Constructor gets called automatically at the
	//time of creating object and it is called exectly one time.
	
	//this is an empty constructor
	//because it does not have any parameterList
	public Box(){
		System.out.println("Empty Constructor");
		length=1;
		width=1;
		height=1;
		color="BLACK";
	}
	
	//this is an Parameterized constructor
	//because it has parameterList
	public Box(int l,int w,int h, String c){
		System.out.println("Parameterized Constructor");
		length=l;
		width=w;
		height=h;
		color=c;
	}

	
	//instance methods
	//accessModifiers returnType methodName (parameterList){ //body }
	//setter Methods
	public void setLength(int l){ length=l; }
	public void setWidth(int w){ 
		if(w>=0){
			width=w;
		}
		else{System.out.println("Invalid Value");}
	}
	public void setHeight(int h){ height=h; }
	public void setColor(String c){color=c;}
	
	//getter methods
	public int getLength(){return length;}
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	public String getColor(){return color;}
	
	//area calculation
	public int getArea(){
		return length*width;
	}
	
	//volume calculation
	public int getVolume(){
		return length*width*height;
	}
	//showDetails method
	public void showDetails(){
		System.out.println("Length : "+getLength());
		System.out.println(getWidth());
		System.out.println(getHeight());
		System.out.println("Area : "+getArea());
		System.out.println(getVolume());
		System.out.println("COLOR : "+color);
		
	}
	
}

public class BoxExample{
	//instance variables/properties/attributes
	//instance methods
	
	//main methods
	public static void main(String[] args){
		//className ObjectName = new className();
		Box be = new Box();
		Box be1 = new Box();
		Box be2; //be2 is a reference holder for Box type of object
		be2 = new Box(5,5,9,"BLUE");
		
		//invoking/calling setter methods
		be.setLength(10);
		be.setWidth(7);
		be.setHeight(5);
		
		be1.setLength(8);
		be1.setWidth(8);
		be1.setHeight(8);
		
		
		be.showDetails();
		be1.showDetails();
		be2.showDetails();
		
		be2.setHeight(5);
		be2.showDetails();
	
	}
	

}