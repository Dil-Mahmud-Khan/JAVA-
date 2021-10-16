public class Start              //declaring main method
{
	
	public static void main(String args[]){
		
		Inventory i1=new Inventory(15);             //creating object of inventory
		
		
		
		//creating circle class object
		Circle c1=new Circle(6.6);
		Circle c2=new Circle(9.4);
		Circle c3=new Circle(9.2);
		
		//inserting reference object of circle
		i1.insertShape(c1);
		i1.insertShape(c2);
		i1.insertShape(c3);
		
		//creating rectangle class object
		Rectangle r1=new Rectangle(5.66,6.7);
		Rectangle r2=new Rectangle(44.5,8.00);
		Rectangle r3=new Rectangle(9.82,62.7);
		
		//inserting reference object of Rectangle
		i1.insertShape(r1);
		i1.insertShape(r2);
		i1.insertShape(r3);
		
		//creataing triangle class object
		Triangle t1=new Triangle(4.5,1.2);
		Triangle t2=new Triangle(6.6,5.6);
		Triangle t3=new Triangle(8.9,5.8);
		
		//inserting reference object of Triangle
		i1.insertShape(t1);
		i1.insertShape(t2);
		i1.insertShape(t3);
		
		//showing all inserted shape
		i1.showAllShapes();
		
		//removing shape of circle,rectangle and triangle
		i1.removeShape(c1);
		i1.removeShape(r2);
		i1.removeShape(t3);
		
		//showing all inserted shapes
		i1.showAllShapes();
		
		
		//creating object for Shape class
		Shape s1=new Shape();
		
		//setting shape type
		s1.setTypeOfShape("Triangle");
		//showing shapes by type
		i1.showShapesByType("Triangle");
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		