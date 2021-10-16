import java.lang.*;

public class 2DArray{
	public static void main(String []args)
	{
		
		int Arr[] []  = new int [2][3];
		
		Arr[0][0]=1;
		Arr[0][1] = 4;
		Arr[1][1] = 6;
		Arr[1][0] = 8;
		
		for (int value[]:Arr)
		{
			for (int v : value){
				System.out.println(v);
			}
		}
		
	}
}

				