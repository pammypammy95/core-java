package sortData;

public class Book implements Comparable<Book>{

	String bookName;
	int ISBN;
	
	public Book(String bookName, int ISBN){
		this.bookName = bookName;
		this.ISBN = ISBN;
	}
	
	public void setBookName(String bookName){
		this.bookName = bookName;
	}
	
	public String getBookName(){
		return bookName;
	}
	
	@Override
	public int compareTo(Book b) {
		// return this.ISBN - b.ISBN;
		return this.getBookName().compareTo(b.bookName);
	}
	
	@Override
	public String toString() { 
		
		
		return this.bookName;
	}
	
}
