package chap01.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelfList implements Aggregate<Book> {
	
	private ArrayList<Book> books;
	
	BookShelfList(ArrayList<Book> books){
		this.books=books;
	}
	
	@Override
	public Iterator<Book> getIterator() {
		// TODO Auto-generated method stub
		return books.iterator();
	}

}
