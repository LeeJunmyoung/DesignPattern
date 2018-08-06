package chap01.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookShelfArr bookShelfArr = new BookShelfArr(4);
		bookShelfArr.appendBook(new Book("집에 가는법"));
		bookShelfArr.appendBook(new Book("공부 하는법"));
		bookShelfArr.appendBook(new Book("이직 하는법"));
		bookShelfArr.appendBook(new Book("퇴근 하는법"));
		
		Iterator<Book> it = bookShelfArr.getIterator();
		while(it.hasNext()){
			System.out.println("arr:::"+it.next().getName());
		}
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book("집에 가는법"));
		list.add(new Book("공부 하는법"));
		list.add(new Book("이직 하는법"));
		list.add(new Book("퇴근 하는법"));
		BookShelfList bookShelfList = new BookShelfList(list);
		
		it = bookShelfList.getIterator();
		while(it.hasNext()){
			System.out.println("list:::"+it.next().getName());
		}
		
	}

}
