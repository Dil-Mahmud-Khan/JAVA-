import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Box b = new Box(5,7,8);
		Box b1 = new Box(5,7,8);
		
		System.out.println("From Normal Box Object");
		b.showBox();
		b1.showBox();
		// null is the default value for object type array
		Box boxes[] = new Box[5];

		boxes[0] = b;
		boxes[1] = b1;
		boxes[2] = new Box(2,2,2);
		boxes[4] = new Box(4,4,4);
		
		boxes[0].showBox();
		boxes[1].showBox();

		
		System.out.println("Showing Box using Array");
		for(int i=0;i<boxes.length;i++){
			if(boxes[i] != null){
				boxes[i].showBox();
			}
		}
		
	}
}




