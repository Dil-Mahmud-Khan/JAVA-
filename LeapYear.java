

class year{
	int i;
	
	public year (){
		i=1;
	}
	

 
 public year(int X){
	 X=i;
 }
  
  public void setX(int X){i=X;}
  
  public int getX(){return i;}
  
  public void testLeapYear(){
	  if((i% 400==0)&& (i%100!=0)||(i%4==0)){
		  System.out.println("This is leap year");
	  }
	  else {
		  System.out.println("This is not leap year");
	  }
  }
  
  public void showYear(){
	  System.out.println("Name of the Year= "+getX());
  }
}

  public class LeapYear{
	
public static void main(String args[]){
       year y1= new year();
	   
	   y1.setX(2019);
	   System.out.println();
	   y1.showYear();
	    System.out.println();
	   y1.testLeapYear();
}
}
   
   