class Animal{
	private String Name;
	private String Color ;
	private double Height;
	private String SpeciesType;
	private int NumberOfLegs;
	private float NoiseRate;
	private String Movement;
	
	
	
	public Animal(){
		Name="a";
		Color="a";
		Height=1;
		SpeciesType="a";
		NumberOfLegs=1;
		NoiseRate=1;
		Movement="a";
		
	}
	
	
	
	public Animal(String a,String b,double c,String d,int e,float f,String g){
		a=Name;
		b=Color;
		c=Height;
		d=SpeciesType;
		e=NumberOfLegs;
		f=NoiseRate;
		g=Movement;
		
	}
	
	public void setName(String a){Name=a;}
	public void setColor(String b){Color=b;}
    public void setHeight(double c){Height=c;}
    public void setSpeciesType(String d){SpeciesType=d;}
	public void setNumbersOfLegs(int e){NumberOfLegs=e;}
	public void setNoiseRate(float f){NoiseRate=f;}
	public void setMovement(String g){Movement=g;}
	
	
    public String getName(){return Name;}
	public String getColor(){return Color;}
	public double getHeight(){return Height;}
	public String getSpeciesType(){return SpeciesType;}
	public int getNumberOfLegs(){return NumberOfLegs;}
	public float getNoiseRate(){return NoiseRate;}
	public String getMovement(){return Movement;}
	

	
	
		
	public void showInfo(){
		System.out.println("Name= "+getName());
		System.out.println("Color= "+getColor());
		System.out.println("Height= "+getHeight());
		System.out.println("Species Type= "+getSpeciesType());
		System.out.println("Number of Legs= "+getNumberOfLegs());
		System.out.println("Noise Rate= "+getNoiseRate());
		System.out.println("Movement= "+getMovement());
		
		
	}
}


public class Animal2{
	public static void main(String [] args){
	
	 Animal bird = new Animal();
	 
	 bird.setName("Eagle");
	 bird.setColor("Black");
	 bird.setHeight(1.7);
	 bird.setSpeciesType("Abes");
	 bird.setNumbersOfLegs(2);
	 bird.setNoiseRate(15f);
	 bird.setMovement("Fly");
	 bird.showInfo();
	
	
	}
}

	 
	
	
	
	
	
	
	
	
	
	