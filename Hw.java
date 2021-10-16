public class Hw
{
  byte b;
  int i;
  float f;
  double d;
  short s;
  long l;
  boolean B;
  char c;
  
  public static void main (String[] args)
  {	
	PrimitiveType pt = new PrimitiveType();
	
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
	
	System.out.println();
	System.out.println("Information about Short");
	System.out.println("Default Value: "+pt.s);
	System.out.println("Minimum Value: "+ Short.MIN_VALUE);
	System.out.println("Maximum Value: "+ Short.MAX_VALUE);
	System.out.println("Size: "+ (Short.SIZE/8) );
	System.out.println("Parsing String to Short: "+ Short.parseShort("10")*2 );
	
	System.out.println();
	System.out.println("Information about Long");
	System.out.println("Default Value: "+pt.l);
	System.out.println("Minimum Value: "+ Long.MIN_VALUE);
	System.out.println("Maximum Value: "+ Long.MAX_VALUE);
	System.out.println("Size: "+ (Long.SIZE/8) );
	System.out.println("Parsing String to Long: "+ Long.parseLong("18")*2 );
	
	System.out.println();
	System.out.println("Information about Floating");
	System.out.println("Default Value: "+pt.f);
	System.out.println("Minimum Value: "+ Float.MIN_VALUE);
	System.out.println("Maximum Value: "+ Float.MAX_VALUE);
	System.out.println("Size: "+ (Float.SIZE/8) );
	System.out.println("Parsing String to floating: "+ Float.parseFloat("10")*2 );
	
	System.out.println();
	System.out.println("Information about Double");
	System.out.println("Default Value: "+pt.d);
	System.out.println("Minimum Value: "+ Double.MIN_VALUE);
	System.out.println("Maximum Value: "+ Double.MAX_VALUE);
	System.out.println("Size: "+ (Double.SIZE/8) );
	System.out.println("Parsing String to Double: "+ Double.parseDouble("15.8")*2 );
	
	System.out.println();
	System.out.println("Information about Boolean");
	System.out.println("Default Value: "+pt.B);
	
	System.out.println();
	System.out.println("Information about character");
	System.out.println("Default Value: "+pt.c);
	System.out.println("Minimum Value: "+ Character.MIN_VALUE);
	System.out.println("Maximum Value: "+ Character.MAX_VALUE);
	System.out.println("Size: "+ (Character.SIZE/8) );
	
  }
  
}
