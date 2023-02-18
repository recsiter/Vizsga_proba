package persistance;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.function.Consumer;
import vizsga_pelda.trippackage.trip;

/**
 * @author G
 */
public abstract class tripList<E> implements List<E> {

    private List<E> innerList;
    private Set<ActionListener> listeners;

    private tripList() {
        innerList = new ArrayList();
        listeners = new HashSet<>();
    }
//<editor-fold defaultstate="collapsed" desc="properties">

    @Override
    public boolean contains(Object o) {
        return innerList.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return innerList.iterator();
    }

    @Override
    public Object[] toArray() {
        return innerList.toArray();
    }

    @Override
    public boolean remove(Object o) {
        listeners.notifyAll();
        return innerList.remove(o);
    }

    @Override
    public E get(int index) {
        return innerList.get(index);
    }

    @Override
    public void add(int index, E element) {
        listeners.notifyAll();
        innerList.add(index, element);
    }

    @Override
    public int indexOf(Object o) {
        return innerList.indexOf(o);
    }

    @Override
    public ListIterator<E> listIterator() {
        return innerList.listIterator();
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return innerList.listIterator(index);
    }

//</editor-fold>
    @Override
    public int size() {
        return innerList.size();
    }
}
