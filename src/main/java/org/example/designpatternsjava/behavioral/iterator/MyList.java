package org.example.designpatternsjava.behavioral.iterator;

public class MyList<T> {
    private T[] items;
    private int size =0;

    public MyList(int capacity) {
        items = (T[]) new Object[capacity];
    }

    public void add(T item) {
        items[size++] = item;
    }

    public MyIterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements MyIterator<T> {
        private int index =0;

        @Override
        public boolean hasNext() {
            return index<size;
        }

        @Override
        public T next() {
            return items[index++];
        }
    }
}
