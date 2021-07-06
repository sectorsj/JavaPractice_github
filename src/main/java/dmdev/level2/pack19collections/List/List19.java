package dmdev.level2.pack19collections.List;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class List19<T> implements Iterable<T> {

    private T[] objects;
    private int size;

    public List19(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
       return objects [index];
    }

    public int getSize() {
        return size;
    }
    
    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new List19Iterator();
    }
    
    private class List19Iterator implements Iterator<T> {
        
        private int currentIndex;
    
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }
    
        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
    
}
