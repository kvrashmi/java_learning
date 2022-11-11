package maps;

public class Book 
{
	int bookId;
	String bookName;
	
	public Book(int bookId,String bookName)
	{
		this.bookId=bookId;
		this.bookName=bookName;
	}
	
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	
	public int getBookId()
	{
		return this.bookId;
	}
	
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	
	public String getBookName()
	{
		return this.bookName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	

}
