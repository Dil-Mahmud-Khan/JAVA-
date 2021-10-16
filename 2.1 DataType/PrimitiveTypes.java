public class PrimitiveTypes
{
  byte b;
  int i;
  public static void main (String[] args)
  {	
	PrimitiveTypes pt = new PrimitiveTypes();
	
	System.out.println("Information about Integer");
	System.out.println("Default Value: "+pt.i);
	System.out.println("Minimum Value: "+ Integer.MIN_VALUE);
	System.out.println("Maximum Value: "+ Integer.MAX_VALUE);
	System.out.println("Size: "+ (Integer.SIZE/8) );
	System.out.println("Parsing String to Integer: "+ Integer.parseInt("10")*2 );
	
	System.out.println();
	System.out.println("Information about Byte");
	System.out.println("Byte Value: "+pt.b);
	System.out.println("Minimum Value: "+ Byte.MIN_VALUE);
	System.out.println("Maximum Value: "+ Byte.MAX_VALUE);
	System.out.println("Size: "+ (Byte.SIZE/8) );
	
  }
  
}