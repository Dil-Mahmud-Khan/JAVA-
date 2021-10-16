import java.lang.*;


public class Library{
	private String libName;
	private String libAddress;
	private int totalBook=0;
	Book[] listOfBook;
	private Book book;
	
	//empty constructor
	public Library(){   
		this.libName="DIL";
		this.libAddress="Mahmud";
		this.totalBook=totalBook++;
	}
	
	//valued constructor
	public Library(String libName,String libAddress,int size){
		this();
		this.libName=libName;
		this.libAddress=libAddress;
		this.listOfBook=new Book[size];
	}
	
	//setter method
	public void setLibName(String libName){this.libName=libName;}
	public void setLibAddress(String libAddress){this.libAddress=libAddress;}
	public void setTotalBook(int totalBook){this.totalBook=totalBook;}
	
	//getter method
	public String getLibName(){return libName;}
	public String getLibAddress(){return libAddress;}
	public int getTotalBook(){return totalBook;}
	
	//showing library info
	public void showLibInfo(){
		System.out.println("Name Of Library : "+getLibName());
		System.out.println(" Address : "+getLibAddress());
		System.out.println(" Total Books :"+getTotalBook());
		
		boolean flag=false;
		for(int i =0;i<listOfBook.length;i++){
			if(listOfBook[i]!=null)
			{
				listOfBook[i].showBookInfo();
			}
		}
	}
	// to add new book method
	public void addNewBook(Book book){
		boolean flag=false;
		for(int i=0;i<listOfBook.length;i++){
			if(listOfBook[i]==null)
			{
				listOfBook[i]=book;
				flag=true;
			
			
			break;
			}
		}
	
	if(flag){
		System.out.println("Book is Added");
	}
	else{
		System.out.println("Book can not be added due to no space");
		}
	
	}
	
	//method to deleteBook
	public void deleteBook(Book book){
		boolean flag=false;
		for(int i=0;i<listOfBook.length;i++){
			if(listOfBook[i]!=null){
				if(listOfBook[i]==book){
					listOfBook=null;
					flag=true;
				}
					break;
				
			}
		}
	if(flag){
		System.out.println("Book is Deleted");
	}
	else{
		System.out.println("Error Found 404 ");
		}
	
	}
	
	//method to addnewbook copy
	public void addNewBookCopy(Book book,int copy){
		boolean flag=false;
		for(int i=0;i<listOfBook.length;i++){
			if(listOfBook[i]!=null){
				if(listOfBook[i]==book){
					listOfBook[i].setbookCopy(copy);
					flag=true;
				}
				break;
			}
		}
		
		
		
		if(flag)
		{
			System.out.println("A copy of a Book is added");
		}
		else
		{
			System.out.println(" Error Occoured 404 ");
		}
	}
}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	