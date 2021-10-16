class Box{
public static int BoxCount;

static{

	BoxCount= 5;
}

static{
	BoxCount= 7;
}
public static void BoxCount(int a){
	BoxCount=a;
}
public Box(){
	System.out.println("this is a empty constructor");
	BoxCount++;
}
public Box(int a){
	System.out.println("this is a parameter constructor");
	BoxCount++;
}

}
public class HuHu{
	public static void main(String [] args){
				System.out.println(Box.BoxCount);
								

		Box b1= new Box();
		Box b2=new Box();
		

	}
}

