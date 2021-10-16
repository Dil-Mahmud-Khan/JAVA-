import java.lang.*;

public class Array2{
	public static void main(String []args)
	{
		
		int Arr[] []  = new int [2][3];
		
		Arr[0][0]=1;
		Arr[1][1] = 6;
		Arr[1][2] = 8;
		
		
		//  for each loop
		
		for (int value[]:Arr)
		{
			for (int v : value){
				System.out.println(v);
			}
			System.out.println();
		}
		
		
		//normal loop
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;i<3;i++)
			{
				System.out.print(Arr[i][j]);
				
				
		System.out.println();
		
	}
}
	}
}
				