class Dil{
	public int Grade;
	
	
	public Dil(){
		Grade=1;
	}
	public Dil(int a){
		Grade=a;
	}
	
	public void setGrade(int a){Grade=a;}
	public int getGrade(){return Grade;}
	
public void testGrade(){
	if(get()Grade>=33){
	System.out.println("D");
	}
	
	else if (get()Grade>=50){
		System.out.println("C");
	}
	else if (get()Grade>=60){
		System.out.println("A-");
	}
	else if (get()Grade>=70){
		System.out.println("A");
	}
	else if (get()Grade>=80){
		System.out.println("A+");
	}
	
	else if (get()Grade>=100){
		System.out.println("Invalid");
	}
	else{
		System.out.println("Fail");
	}
	
}


}
public class Grading{
	public static void main(String [] args){
	
	
Dil d1=new Dil();

d1.setGrade(67);


	}
}












	
	
	
	
	
	
	
	