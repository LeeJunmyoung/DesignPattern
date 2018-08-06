package chap01.Iterator;

import java.util.Iterator;

public class BookShelfArr implements Aggregate<Book> {

	private Book[] books;
	private int last = 0;
	public BookShelfArr(int maxsize){
		this.books = new Book[maxsize];
	}
	
	public Book getBooAt(int index){
		return books[index];
	}
	
	public void appendBook(Book book){
		this.books[last] = book;
		last++;
	}
	
	public int getLength(){
		return last;
	}

	@Override
	public Iterator<Book> getIterator() {
		// TODO Auto-generated method stub
		return new BooksIterator(books);
	}
	
	
	
	
}
