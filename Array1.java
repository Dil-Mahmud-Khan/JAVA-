import java.lang.*;

public class Array1{
	public static void main(String [] args)
	{
		
		//1st approach
		
		int A[];
		A= new int [5];
		
		A[0] = 10;
		A[3] = 20;
		
		for(int i=0;i<A.length;i++)
		{
		
		System.out.println(" A["+i+"] : "  +A[i]);
		}
		
		for(int value : A)
		{
			System.out.println(value);
		
		
	}
	
// 2nd approach

			int B[];
			int size = (A[3]/A[0])+2;
			B=  new int [size];
			
			
			B[0]= 10;
			B[1] = 34;
			B[2] = 32;
			B[3] = 22;
			
			for (int value : B)
			{
				System.out.println(value);
			}
			
			
			//3rd approach
			
			int C[]=new int[]{22,34,23};
			
			for( int i = 0; i<C.length;i++){
				
			System.out.println("C ["+i+"] :"+C[i]);
			}
			
		//4th approach		
			
	     int D[] = {1,2,3,4,5};
		  int index = 0;
		  
		  while(index<D.length)
		  {
			  System.out.println(D[index]);
			  index++;
		  }
		  
	
	
	
}

}

		
		
