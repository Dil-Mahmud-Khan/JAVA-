import java.lang.*;

class Book {
	private String bookName;
    private String bookAuthor;
	private String bookId;
	private String bookType;
	private int bookCopy;
	public static int bookCounter;
	
	
public  Book(){//empty constructor
	bookCounter++;
}
	
public Book(String a,String b,String c,String d,int e){//valued constructor
	
	bookName= a ;
	bookAuthor = b;
	bookId= c;
	bookType=d;
	bookCopy= e;
}

	//setter methods
public void setbookName(String a){bookName=a;}
public void setbookAuthor(String b){bookAuthor=b;}
public void setbookId(String c){bookId=c;}
public void setbookType(String d){bookType=d;}
public void setbookCopy(int e){bookCopy= e;}

//getter methods
public String getbookName(){return bookName;}
public String getbookAuthor(){return bookAuthor;}
public String getbookId(){return bookId;}
public String getbookType(){return bookType;}
public int getbookCopy(){return bookCopy;}

//showing book informations
public void showBookInfo(){
	
	System.out.println("BookName: "+getbookName());
	System.out.println("BookAuthor: "+getbookAuthor());
    System.out.println("BookId:"+getbookId());
	System.out.println("BookType: "+getbookType());
    System.out.println("BookCopy: "+getbookCopy());
	
	System.out.println();
}

public void AddBookCopy(int x){
	bookCopy= x;
}



public  void showTotalBookInfo(){

System.out.println(" Total Book: "+bookCounter);


}
}