package TPE_SS2014.UIB05.Uebung03;

import java.util.ArrayList;
import java.util.Iterator;

//TODO: Timo
public class ListImpl<T> implements List<T> {

	ArrayList<T> list = new ArrayList<T>();
	Iterable<T> iterable = list;
	Iterator<T> iterator = iterable.iterator();

	/**
	 * ̈Uberprüft, ob ein Element bereits vorhanden ist. *
	 * 
	 * @param e
	 *            Element auf das geprüft werden soll
	 * @return true wenn vorhanden, andernfalls false
	 */
	@Override
	public boolean contains(Object e) {
		for (T t : list) {
			if (t.equals(((T) t)))
				return true;
		}
		return false;
	}

	/**
	 * F ̈ugt am Ende ein Element hinzu.
	 * 
	 * @param e
	 *            Element, das hinzugefügt werden soll.
	 * @return ist immer true
	 */
	@Override
	public boolean add(T e) {
		this.list.add(e);
		return true;
	}

	/**
	 * Fügt am Anfang ein Element hinzu. *
	 * 
	 * @param e
	 *            Element, das angefügt werden soll.
	 */
	@Override
	public void addFirst(T e) {
		ArrayList<T> newList = new ArrayList<T>();
		newList.add(e);
		for (T t : this.list) {
			newList.add(t);
		}
		this.list = newList;
	}

	/**
	 * Liefert das erste Element zurück, ohne es zu entfernen.
	 * 
	 * @return das erste Element.
	 */
	@Override
	public T peekFirst() {
		return ((T) list.toArray()[0]);
	}

	/**
	 * ̈Uberprüft, ob Elemente vorhanden sind.
	 * 
	 * @return true wenn die Datenstruktur leer ist, andernfalls false
	 */
	@Override
	public boolean isEmpty() {
		if (this.list == null) {
			return false;
		} else if (this.list.size() > 0) {
			return false;
		} else
			return true;
	}

	/**
	 * Entfernt das erste Element und liefert es zurück. *
	 * 
	 * @return das erste Element
	 */
	@Override
	public T pollFirst() {
		T firstElement = ((T)this.list.toArray()[0]);
		this.list.remove(0);
		return firstElement;
	}

	/**
	 * Löscht den Inhalt der List. 2
	 */
	@Override
	public void clear() {
		this.list.clear();
	}

	@Override
	public Iterator<T> iterator() {
		return this.iterator;
	}
}
