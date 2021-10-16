 class Shape{
  private String typeOfShape;         //declaring variable
  
  public Shape(){                       //default constructor
	  this.typeOfShape="Dil";
  }
  
  public Shape(String typeOfShape){         //parameterized constructor
	  this.typeOfShape=typeOfShape;
  }
  
  //setter method and getter method
  public void setTypeOfShape(String typeOfShape){
  this.typeOfShape=typeOfShape;}
  
  public String getTypeOfShape(){return typeOfShape;}
  
  //method to declare area
  public double area(){
	  double area=0;
	  return area;
  }
  
  //method to show details
  public void showDetails(){
	  System.out.println("Nothing to show");
  }
 }
 
  
  