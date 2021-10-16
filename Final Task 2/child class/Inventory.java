public class Inventory{
	
	Shape shapes[];               //declaring variables
	static int numberOfShapes;
	
	static{                          
		int numberOfShapes=5;
	}
	
	public Inventory(){}           //empty constructor
	
	public Inventory(int sizeOfInventorys){          //parameterized constructor   
		shapes=new Shape[sizeOfInventorys];
	}
	
	
	//method to insert the shape 
	public void insertShape(Shape s){
		boolean flag=false;
		for(int i=0;i<shapes.length;i++){
			if(shapes[i]==null){
				shapes[i]=s;
				flag=true;
				break;
			}
		}	
	}

//method to remove the shape
public void removeShape(Shape s){
	
	for(int i=0;i<shapes.length;i++){
		if(shapes[i]!=null){
			if(shapes[i]==s){
			shapes[i]=null;
			}
		}
	}
}

//method to show all shapes
	public void showAllShapes(){
       
		for(int i=0;i<shapes.length;i++){
			if(shapes[i]!=null){
				shapes[i].showDetails();
			}
		}
	}
	
	//method to show shapes by type
	public void showShapesByType(String type){
		for(int i=0;i<shapes.length;i++){
			if(shapes[i]!=null){
				if(shapes[i].getTypeOfShape()==type){
					System.out.println("This is "+type+"of shape");
					shapes[i].showDetails();
				}
				
				
			}
		}
	}


}	
				
			
		












