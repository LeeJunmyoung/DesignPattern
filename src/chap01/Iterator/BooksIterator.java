package chap01.Iterator;

import java.util.Iterator;

public class BooksIterator implements Iterator<Book>{

	private Book[] books;
	int index=0;
	
	public BooksIterator(Book[] books) {
		this.books = books;
	} 
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(index>=books.length||books[index]==null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Book next() {
		Book book = books[index];
		index++;
		return book;
	}

}
