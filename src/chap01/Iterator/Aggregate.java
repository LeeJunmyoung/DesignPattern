package chap01.Iterator;

import java.util.Iterator;

public interface Aggregate<E> {
	public abstract Iterator<E> getIterator();
}
